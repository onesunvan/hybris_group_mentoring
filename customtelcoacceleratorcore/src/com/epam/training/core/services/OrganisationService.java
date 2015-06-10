package com.epam.training.core.services;

import com.epam.training.core.model.OrganisationModel;

import java.util.List;

public interface OrganisationService {

    List<OrganisationModel> getOrganisations();

    OrganisationModel getOrganisationForId(Integer id);
}
