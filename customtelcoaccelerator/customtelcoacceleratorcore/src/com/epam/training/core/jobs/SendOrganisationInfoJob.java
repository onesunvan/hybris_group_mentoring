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

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.log4j.Logger;

import com.epam.training.core.daos.OrganisationsFeaturesDao;


public class SendOrganisationInfoJob extends AbstractJobPerformable<CronJobModel>
{
	private static final Logger LOG = Logger.getLogger(SendOrganisationInfoJob.class);

	private EmailService emailService;
	private OrganisationsFeaturesDao ofDao;
	
	private String emailToAddress;
	private String emailFromAddress;
	private String emailDisplayName;
	private String emailSubject;
	
	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{
		ArrayList<String> organisationsAndCustomers = ofDao.getUsersListByOrganisation();
		
		StringBuilder emailBody = new StringBuilder();
		
		for (String string : organisationsAndCustomers)
		{
			LOG.info("Record: " + string);
			emailBody.
				append("<p>").
				append(string).
				append("<hr></p>");
		}

		List<EmailAddressModel> addressesList = new ArrayList<EmailAddressModel>();
 
		EmailAddressModel emailAddressToModel = emailService.getOrCreateEmailAddressForEmail(emailToAddress, emailDisplayName);
		addressesList.add(emailAddressToModel);
		
		EmailAddressModel emailAddressFromModel = emailService.getOrCreateEmailAddressForEmail(emailFromAddress, emailDisplayName);
		
		EmailMessageModel emailMessageModel = emailService.createEmailMessage(addressesList, null, null, emailAddressFromModel, null, emailSubject, emailBody.toString(), null);
		emailService.send(emailMessageModel);
		
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

	public String getEmailToAddress()
	{
		return emailToAddress;
	}

	public void setEmailToAddress(String emailToAddress)
	{
		this.emailToAddress = emailToAddress;
	}

	public String getEmailFromAddress()
	{
		return emailFromAddress;
	}

	public void setEmailFromAddress(String emailFromAddress)
	{
		this.emailFromAddress = emailFromAddress;
	}

	public OrganisationsFeaturesDao getOfDao()
	{
		return ofDao;
	}

	public void setOfDao(final OrganisationsFeaturesDao ofDao)
	{
		this.ofDao = ofDao;
	}

	public void setEmailService(final EmailService emailService)
	{
		this.emailService = emailService;
	}

	protected EmailService getEmailService()
	{
		return emailService;
	}

	public String getEmailSubject()
	{
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject)
	{
		this.emailSubject = emailSubject;
	}

	public String getEmailDisplayName()
	{
		return emailDisplayName;
	}

	public void setEmailDisplayName(String emailDisplayName)
	{
		this.emailDisplayName = emailDisplayName;
	}	
	
}
