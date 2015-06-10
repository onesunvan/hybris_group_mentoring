package com.epam.training.core.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import com.epam.training.core.daos.OrganisationDao;
import com.epam.training.core.model.OrganisationModel;


public class FlexibleQueryOrganisationDao implements OrganisationDao
{

	private static final String SELECT_ALL_ORGANISATIONS_QUERY = "SELECT {" + OrganisationModel.PK + "} FROM {"
			+ OrganisationModel._TYPECODE + "}";

	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<OrganisationModel> findAllOrganisations()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(SELECT_ALL_ORGANISATIONS_QUERY);
		return flexibleSearchService.<OrganisationModel> search(query).getResult();
	}

	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

}
