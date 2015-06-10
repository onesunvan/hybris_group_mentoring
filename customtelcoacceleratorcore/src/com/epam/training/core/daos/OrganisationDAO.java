package com.epam.training.core.daos;

import com.epam.training.core.model.OrganisationModel;

import java.util.List;

public interface OrganisationDAO {

    List<OrganisationModel> findOrganisations();

    List<OrganisationModel> findOrganisationsById(Integer id);
}
