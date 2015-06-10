package com.epam.training.core.services.impl;

import com.epam.training.core.model.OrganisationModel;
import com.epam.training.core.services.OrganisationService;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@IntegrationTest
public class DefaultOrganisationServiceIntegrationTest extends ServicelayerTransactionalTest {

    @Resource
    private OrganisationService organisationService;
    @Resource
    private ModelService modelService;

    private OrganisationModel organisationModel;
    private static final Integer ORGANISATION_ID = 1234;
    private static final String ORGANISATION_NAME = "test_organisation";

    @Before
    public void setUp()
    {
        organisationModel = new OrganisationModel();
        organisationModel.setId(ORGANISATION_ID);
        organisationModel.setName(ORGANISATION_NAME, Locale.ENGLISH);
    }

    @Test(expected = UnknownIdentifierException.class)
    public void testFailBehavior()
    {
        organisationService.getOrganisationForId(ORGANISATION_ID);
    }

    @Test
    public void testStadiumService()
    {
        List<OrganisationModel> organisationModels = organisationService.getOrganisations();
        final int size = organisationModels.size();

        modelService.save(organisationModel);

        organisationModels = organisationService.getOrganisations();
        assertEquals(size + 1, organisationModels.size());
        assertEquals("Unexpected organisation found", organisationModel, organisationModels.get(organisationModels.size() - 1));

        final OrganisationModel persistedOrganisationModel = organisationService.getOrganisationForId(ORGANISATION_ID);
        assertNotNull("No organisation found", persistedOrganisationModel);
        assertEquals("Different organisation found", organisationModel, persistedOrganisationModel);
    }

}
