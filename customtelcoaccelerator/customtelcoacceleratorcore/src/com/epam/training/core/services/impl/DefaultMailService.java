package com.epam.training.core.services.impl;

import static java.util.Arrays.asList;
import static java.util.Collections.EMPTY_LIST;

import de.hybris.platform.acceleratorservices.email.EmailService;
import de.hybris.platform.acceleratorservices.model.email.EmailAddressModel;
import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.core.model.user.CustomerModel;

import com.epam.training.core.model.OrganisationModel;
import com.epam.training.core.services.MailService;


public class DefaultMailService implements MailService
{

	private static final String EMAIL_SUBJECT = "Organisation's customers notification!";
	private static final String SENDER_EMAIL = "darwinepam@gmail.com";

	private EmailService emailService;

	@Override
	public void sendOrganisationCustomersNotificationMail(final OrganisationModel organisation)
	{
		final EmailAddressModel recipientEmailAddress = getOrganisationEmailAddress(organisation);
		final EmailAddressModel senderEmailAddress = getSenderEmailAddress();
		final String emailBody = createEmailBody(organisation);

		final EmailMessageModel message = emailService.createEmailMessage(asList(recipientEmailAddress), EMPTY_LIST, EMPTY_LIST,
				senderEmailAddress, SENDER_EMAIL, EMAIL_SUBJECT, emailBody, EMPTY_LIST);
		emailService.send(message);
	}

	private String createEmailBody(final OrganisationModel organisation)
	{
		final StringBuilder emailBodyBuilder = new StringBuilder("Organisation's customers:<br/>");
		for (final CustomerModel customer : organisation.getCustomers())
		{
			emailBodyBuilder.append(customer.getName());
			emailBodyBuilder.append("<br/>");
		}
		return emailBodyBuilder.toString();
	}

	private EmailAddressModel getSenderEmailAddress()
	{
		return emailService.getOrCreateEmailAddressForEmail(SENDER_EMAIL, SENDER_EMAIL);
	}

	private EmailAddressModel getOrganisationEmailAddress(final OrganisationModel organisation)
	{
		return emailService.getOrCreateEmailAddressForEmail(organisation.getEmail(), organisation.getEmail());
	}

	public void setEmailService(final EmailService emailService)
	{
		this.emailService = emailService;
	}

}