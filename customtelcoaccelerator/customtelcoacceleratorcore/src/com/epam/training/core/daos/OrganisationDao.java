package com.epam.training.core.daos;

import java.util.List;

import com.epam.training.core.model.OrganisationModel;


public interface OrganisationDao
{
	/**
	 * Return a list of organisations that are currently persisted. If none are found an empty list is returned.
	 *
	 * @return all organisations in the system
	 */
	List<OrganisationModel> findAllOrganisations();
}
