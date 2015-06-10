package com.epam.training.core.services;

import com.epam.training.core.model.OrganisationModel;


public interface MailService
{
	void sendOrganisationCustomersNotificationMail(OrganisationModel organisation);
}
