package com.epam.training.core.daos.impl;

import static org.junit.Assert.*;

import com.epam.training.core.daos.OrganisationDAO;
import com.epam.training.core.model.OrganisationModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class DefaultOrganisationDAOIntegrationTest extends ServicelayerTransactionalTest {

    @Resource
    private OrganisationDAO organisationDAO;

    @Resource
    private ModelService modelService;

    private static final Integer ORGANISATION_ID = 1234;

    private static final String ORGANISATION_NAME = "test_organisation";

    @Test
    public void organisationDAOTest(){
        List<OrganisationModel> organisationsById = organisationDAO.findOrganisationsById(ORGANISATION_ID);
        assertTrue("No Organisation should be returned",organisationsById.isEmpty());

        List<OrganisationModel> allOrganisations = organisationDAO.findOrganisations();
        final int size = allOrganisations.size();

        final OrganisationModel organisationModel = new OrganisationModel();
        organisationModel.setId(ORGANISATION_ID);
        organisationModel.setName(ORGANISATION_NAME);
        modelService.save(organisationModel);

        allOrganisations = organisationDAO.findOrganisations();
        assertEquals(size + 1, allOrganisations.size());
        assertEquals("Unexpected Organisation found", organisationModel, allOrganisations.get(allOrganisations.size() - 1));

        organisationsById = organisationDAO.findOrganisationsById(ORGANISATION_ID);
        assertEquals("Find the one we just saved", 1, organisationsById.size());
        assertEquals("Check the name", ORGANISATION_NAME, organisationsById.get(0).getName());
        assertEquals("Check the id", ORGANISATION_ID, organisationsById.get(0).getId());


    }

}
