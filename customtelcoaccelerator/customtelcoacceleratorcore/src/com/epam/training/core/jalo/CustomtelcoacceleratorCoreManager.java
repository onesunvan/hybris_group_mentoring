/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package com.epam.training.core.jalo;

import com.epam.training.core.constants.CustomtelcoacceleratorCoreConstants;
import com.epam.training.core.setup.CoreSystemSetup;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 */
@SuppressWarnings("PMD")
public class CustomtelcoacceleratorCoreManager extends GeneratedCustomtelcoacceleratorCoreManager {
    public static final CustomtelcoacceleratorCoreManager getInstance() {
        final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
        return (CustomtelcoacceleratorCoreManager) em.getExtension(CustomtelcoacceleratorCoreConstants.EXTENSIONNAME);
    }
}
