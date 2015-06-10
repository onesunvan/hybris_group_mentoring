package com.epam.training.core.jobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;

import com.epam.training.core.model.OrganisationModel;
import com.epam.training.core.services.MailService;
import com.epam.training.core.services.OrganisationService;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;


public class SendOrganisationCustomersNotificationMailJob extends AbstractJobPerformable<CronJobModel>
{

	private OrganisationService organisationService;
	private MailService mailService;

	@Override
	public PerformResult perform(final CronJobModel cronJobModel)
	{
		final List<OrganisationModel> organisations = organisationService.getAllOrganisations();
		final List<OrganisationModel> eligibleOrganisations = filterOrganisationsWithEmail(organisations);
		sendOrganisationCustomersNotification(eligibleOrganisations);
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

	private List<OrganisationModel> filterOrganisationsWithEmail(final List<OrganisationModel> organisations)
	{
		return Lists.newArrayList(Iterables.filter(organisations, new Predicate<OrganisationModel>()
		{
			@Override
			public boolean apply(final OrganisationModel organisation)
			{
				return StringUtils.isNotEmpty(organisation.getEmail());
			}
		}));
	}

	private void sendOrganisationCustomersNotification(final List<OrganisationModel> organisations)
	{
		for (final OrganisationModel organisation : organisations)
		{
			mailService.sendOrganisationCustomersNotificationMail(organisation);
		}
	}

	@Required
	public void setOrganisationService(final OrganisationService organisationService)
	{
		this.organisationService = organisationService;
	}

	@Required
	public void setMailService(final MailService mailService)
	{
		this.mailService = mailService;
	}

}
