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
package com.epam.training.core.daos.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.epam.training.core.daos.OrganisationsFeaturesDao;
import com.epam.training.core.model.OrganisationModel;


public class DefaultOrganisationFeaturesDao extends AbstractItemDao implements OrganisationsFeaturesDao
{

	private static final String FIND_ORGANISATIONS = 
			" SELECT {a:" + OrganisationModel.PK + "}" +
			" FROM {" + OrganisationModel._TYPECODE + " AS a } ";
	 

	@Override
	public ArrayList<String> getUsersListByOrganisation()
	{

		final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_ORGANISATIONS);

		List<OrganisationModel> searchResult = getFlexibleSearchService().<OrganisationModel> search(query).getResult(); 

		ArrayList<String> organisationsAndCustomers = new ArrayList();
		
		for (OrganisationModel organisationModel : searchResult)
		{
			StringBuilder organisationFields = new StringBuilder();
			
			organisationFields.
				append("Organisation: id=").
				append(organisationModel.getId()).
				append(", email=").
				append(organisationModel.getEmail()).
				append(" User names: ");
		
			Collection<CustomerModel> customers = organisationModel.getCustomers();
			
			StringBuilder userNames = new StringBuilder();
			
			for (CustomerModel customerModel : customers)
			{
				userNames.
					append(customerModel.getName()).
					append(", ");
			}
			
			organisationsAndCustomers.add(organisationFields.toString() + userNames);
		}
		
		return organisationsAndCustomers;
	}

}
