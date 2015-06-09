/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.epam.training.core.jobs;

import de.hybris.platform.acceleratorservices.email.EmailService;
import de.hybris.platform.acceleratorservices.model.email.EmailAddressModel;
import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


public class SendOrganisationInfoJob extends AbstractJobPerformable<CronJobModel>
{
	private static final Logger LOG = Logger.getLogger(SendOrganisationInfoJob.class);

	private EmailService emailService;

	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{
		LOG.info("Sending organisation info email");
		LOG.info("emailService: " + emailService);

		final EmailMessageModel emailMessageModel = new EmailMessageModel();

		final List<EmailAddressModel> addressesList = new ArrayList<EmailAddressModel>();

		final EmailAddressModel emailAddressModel = new EmailAddressModel();

		emailAddressModel.setEmailAddress("Serhii_Kashyn@epam.com");
		emailAddressModel.setDisplayName("Sergey Kashyn");

		addressesList.add(emailAddressModel);

		emailMessageModel.setToAddresses(addressesList);
		emailMessageModel.setFromAddress(emailAddressModel);
		emailMessageModel.setReplyToAddress("Serhii_Kashyn@epam.com");
		emailMessageModel.setSubject("Some subject");
		emailMessageModel.setBody("Some email body");

		emailService.send(emailMessageModel);

		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

	public void setEmailService(final EmailService emailService)
	{
		this.emailService = emailService;
	}

	protected EmailService getEmailService()
	{
		return emailService;
	}

}
