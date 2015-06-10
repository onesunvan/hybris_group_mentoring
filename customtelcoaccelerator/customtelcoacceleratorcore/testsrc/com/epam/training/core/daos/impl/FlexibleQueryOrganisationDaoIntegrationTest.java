package com.epam.training.core.daos.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;

import javax.annotation.Resource;

import com.epam.training.core.daos.OrganisationDao;


@IntegrationTest
public class FlexibleQueryOrganisationDaoIntegrationTest extends OrganisationDaoIntegrationTest
{

	@Resource(name = "flexibleQueryOrganisationDao")
	private OrganisationDao organisationDao;

	@Override
	protected OrganisationDao createOrganisationDao()
	{
		return organisationDao;
	}

}
