package com.epam.training.core.services.impl;

import com.epam.training.core.daos.OrganisationDAO;
import com.epam.training.core.model.OrganisationModel;
import com.epam.training.core.services.OrganisationService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultOrganisationService implements OrganisationService {

    private OrganisationDAO organisationDAO;

    @Override
    public List<OrganisationModel> getOrganisations() {
        return organisationDAO.findOrganisations();
    }

    @Override
    public OrganisationModel getOrganisationForId(Integer id) {
        final List<OrganisationModel> result = organisationDAO.findOrganisationsById(id);
        if (result.isEmpty())
        {
            throw new UnknownIdentifierException("Organisation with code '" + id + "' not found!");
        }
        else if (result.size() > 1)
        {
            throw new AmbiguousIdentifierException("Organisation id '" + id + "' is not unique, " + result.size()
                    + " organisations found!");
        }
        return result.get(0);
    }

    @Required
    public void setOrganisationDAO(final OrganisationDAO stadiumDAO)
    {
        this.organisationDAO = stadiumDAO;
    }
}
