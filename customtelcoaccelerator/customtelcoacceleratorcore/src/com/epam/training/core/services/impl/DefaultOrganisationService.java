package com.epam.training.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.epam.training.core.daos.OrganisationDao;
import com.epam.training.core.model.OrganisationModel;
import com.epam.training.core.services.OrganisationService;


public class DefaultOrganisationService implements OrganisationService
{

	private OrganisationDao organisationDao;

	@Override
	public List<OrganisationModel> getAllOrganisations()
	{
		return organisationDao.findAllOrganisations();
	}

	@Required
	public void setOrganisationDao(final OrganisationDao organisationDao)
	{
		this.organisationDao = organisationDao;
	}

}
