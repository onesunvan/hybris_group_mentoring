package com.epam.training.core.services.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.epam.training.core.daos.OrganisationDao;
import com.epam.training.core.model.OrganisationModel;


@UnitTest
public class DefaultOrganisationServiceTest
{

	private DefaultOrganisationService organisationService;

	@Before
	public void setUp()
	{
		final OrganisationModel organisation = new OrganisationModel();

		final OrganisationDao organisationDao = mock(OrganisationDao.class);
		when(organisationDao.findAllOrganisations()).thenReturn(Arrays.asList(organisation));

		organisationService = new DefaultOrganisationService();
		organisationService.setOrganisationDao(organisationDao);
	}

	@Test
	public void testGetAllOrganisations()
	{
		final List<OrganisationModel> organisations = organisationService.getAllOrganisations();

		assertNotNull(organisations);
		assertEquals(1, organisations.size());
	}
}
