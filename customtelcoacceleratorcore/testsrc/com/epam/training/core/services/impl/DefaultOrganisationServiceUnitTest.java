package com.epam.training.core.services.impl;

import com.epam.training.core.daos.OrganisationDAO;
import com.epam.training.core.model.OrganisationModel;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.OrderModel;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@UnitTest
public class DefaultOrganisationServiceUnitTest {
    private DefaultOrganisationService organisationService;
    private OrganisationDAO organisationDAO;
    private OrganisationModel organisationModel;

    private static final Integer ORGANISATION_ID = 1234;

    private static final String ORGANISATION_NAME = "test_organisation";

    @Before
    public void setUp(){
        organisationService = new DefaultOrganisationService();
        organisationDAO = mock(OrganisationDAO.class);
        organisationService.setOrganisationDAO(organisationDAO);

        organisationModel = new OrganisationModel();
        organisationModel.setId(ORGANISATION_ID);
        organisationModel.setName(ORGANISATION_NAME, Locale.ENGLISH);
    }

    @Test
    public void testGetAllOrganisations(){
        final List<OrganisationModel> organisationModels = Arrays.asList(organisationModel);

        when(organisationDAO.findOrganisations()).thenReturn(organisationModels);

        final List<OrganisationModel> result = organisationService.getOrganisations();
        assertEquals("Should find one", 1, result.size());
        assertEquals("Should equals what the mock returned", organisationModel, result.get(0));
    }

    @Test
    public void testGetOrganisationById()
    {
        when(organisationDAO.findOrganisationsById(ORGANISATION_ID)).thenReturn(Collections.singletonList(organisationModel));

        final OrganisationModel result = organisationService.getOrganisationForId(ORGANISATION_ID);
        assertEquals("Should equals what the mock returned", organisationModel, result);
    }
}
