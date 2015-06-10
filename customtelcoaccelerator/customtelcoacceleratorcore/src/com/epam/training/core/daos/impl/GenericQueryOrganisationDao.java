package com.epam.training.core.daos.impl;

import de.hybris.platform.core.GenericQuery;
import de.hybris.platform.genericsearch.GenericSearchService;

import java.util.List;

import com.epam.training.core.daos.OrganisationDao;
import com.epam.training.core.model.OrganisationModel;


public class GenericQueryOrganisationDao implements OrganisationDao
{

	private GenericSearchService genericSearchService;

	@Override
	public List<OrganisationModel> findAllOrganisations()
	{
		final GenericQuery query = new GenericQuery(OrganisationModel._TYPECODE);
		return genericSearchService.<OrganisationModel> search(query).getResult();
	}

	public void setGenericSearchService(final GenericSearchService genericSearchService)
	{
		this.genericSearchService = genericSearchService;
	}

}
