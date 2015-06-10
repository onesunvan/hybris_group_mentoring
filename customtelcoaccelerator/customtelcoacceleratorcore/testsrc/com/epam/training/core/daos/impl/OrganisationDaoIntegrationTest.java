package com.epam.training.core.daos.impl;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.hybris.platform.jalo.CoreBasicDataCreator;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.epam.training.core.daos.OrganisationDao;
import com.epam.training.core.model.OrganisationModel;


public abstract class OrganisationDaoIntegrationTest extends ServicelayerTest
{

	private static final Logger LOG = Logger.getLogger(OrganisationDaoIntegrationTest.class);

	private OrganisationDao organisationDao;

	@Resource
	private ModelService modelService;

	@Before
	public void setUp() throws Exception
	{
		organisationDao = createOrganisationDao();
		final String organisationDaoName = organisationDao.getClass().getSimpleName();

		LOG.info(format("Importing test data for %s ...", organisationDaoName));
		new CoreBasicDataCreator().createEssentialData(Collections.EMPTY_MAP, null);
		importCsv("/test/impex/test_organisations.impex", "utf-8");
		LOG.info(format("Finished test data importing for %s", organisationDaoName));
	}

	@Test
	public void testFindAllOrganisations()
	{
		final List<OrganisationModel> organisations = organisationDao.findAllOrganisations();

		assertNotNull(organisations);
		assertEquals(3, organisations.size());
	}

	protected abstract OrganisationDao createOrganisationDao();
}
