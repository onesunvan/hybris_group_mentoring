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
package com.epam.training.core.constraints;


import de.hybris.platform.core.model.product.ProductModel;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * The annotated element (a product's classification attribute that is assigned to the product's category) must not be
 * empty or <code>null</code>. Supported type is {@link ProductModel} and its sub types.
 */
@Target(
        {FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ClassificationNotBlankValidator.class)
@Documented
public @interface ClassificationNotBlank {
    String message() default "{com.epam.training.core.constraints.ClassificationNotBlank.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    public abstract String category();

    public abstract String classification();

}
