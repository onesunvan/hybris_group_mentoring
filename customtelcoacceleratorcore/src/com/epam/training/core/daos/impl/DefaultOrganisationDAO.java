package com.epam.training.core.daos.impl;

import com.epam.training.core.daos.OrganisationDAO;
import com.epam.training.core.model.OrganisationModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "organisationDAO")
public class DefaultOrganisationDAO implements OrganisationDAO {

    @Autowired
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<OrganisationModel> findOrganisations() {
        final String queryString =
                "SELECT {p:" + OrganisationModel.PK + "}"
                + "FROM {" + OrganisationModel._TYPECODE + " AS p}";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        return flexibleSearchService.<OrganisationModel>search(query).getResult();
    }

    @Override
    public List<OrganisationModel> findOrganisationsById(Integer id) {
        final String queryString =
                "SELECT {p:" + OrganisationModel.PK + "}"
                + "FROM {" + OrganisationModel._TYPECODE + " AS p}"
                + "WHERE " + "{p:"+ OrganisationModel.ID + "}=?id ";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("id", id);

        return flexibleSearchService.<OrganisationModel>search(query).getResult();

    }
}
