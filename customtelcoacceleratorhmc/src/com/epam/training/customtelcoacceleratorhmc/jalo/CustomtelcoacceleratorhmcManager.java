package com.epam.training.customtelcoacceleratorhmc.jalo;

import com.epam.training.customtelcoacceleratorhmc.constants.CustomtelcoacceleratorhmcConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class CustomtelcoacceleratorhmcManager extends GeneratedCustomtelcoacceleratorhmcManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( CustomtelcoacceleratorhmcManager.class.getName() );
	
	public static final CustomtelcoacceleratorhmcManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CustomtelcoacceleratorhmcManager) em.getExtension(CustomtelcoacceleratorhmcConstants.EXTENSIONNAME);
	}
	
}
