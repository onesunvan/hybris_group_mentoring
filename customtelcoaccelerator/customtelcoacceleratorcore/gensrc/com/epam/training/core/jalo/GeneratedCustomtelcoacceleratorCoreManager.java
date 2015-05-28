/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 28, 2015 6:24:35 PM                     ---
 * ----------------------------------------------------------------
 */
package com.epam.training.core.jalo;

import com.epam.training.core.constants.CustomtelcoacceleratorCoreConstants;
import com.epam.training.core.jalo.Accessory;
import com.epam.training.core.jalo.ClassificationNotBlankConstraint;
import com.epam.training.core.jalo.Device;
import com.epam.training.core.jalo.Organisation;
import com.epam.training.core.jalo.ProductReferencesAndClassificationsComponent;
import com.epam.training.core.jalo.ProductReferencesAndClassificationsForDevicesComponent;
import com.epam.training.core.jalo.ServiceAddOn;
import com.epam.training.core.jalo.ServicePlan;
import de.hybris.platform.catalog.jalo.classification.ClassAttributeAssignment;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.type.Type;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>CustomtelcoacceleratorCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCustomtelcoacceleratorCoreManager extends Extension
{
	/** Relation ordering override parameter constants for Customer2Organisation from ((customtelcoacceleratorcore))*/
	protected static String CUSTOMER2ORGANISATION_SRC_ORDERED = "relation.Customer2Organisation.source.ordered";
	protected static String CUSTOMER2ORGANISATION_TGT_ORDERED = "relation.Customer2Organisation.target.ordered";
	/** Relation disable markmodifed parameter constants for Customer2Organisation from ((customtelcoacceleratorcore))*/
	protected static String CUSTOMER2ORGANISATION_MARKMODIFIED = "relation.Customer2Organisation.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductReferencesAndClassificationsComponent> PRODUCTACCESSORYCOMPONENT2CLASSATTRIBUTEASSIGNRELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER = new OneToManyHandler<ProductReferencesAndClassificationsComponent>(
	CustomtelcoacceleratorCoreConstants.TC.PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENT,
	false,
	"classAttributeAssignment",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductReferencesAndClassificationsComponent> PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENT2TARGETITEMTYPERELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER = new OneToManyHandler<ProductReferencesAndClassificationsComponent>(
	CustomtelcoacceleratorCoreConstants.TC.PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENT,
	false,
	"targetItemType",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("status", AttributeMode.INITIAL);
		tmp.put("attemptCount", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute.
	 * @return the attemptCount
	 */
	public Integer getAttemptCount(final SessionContext ctx, final Customer item)
	{
		return (Integer)item.getProperty( ctx, CustomtelcoacceleratorCoreConstants.Attributes.Customer.ATTEMPTCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute.
	 * @return the attemptCount
	 */
	public Integer getAttemptCount(final Customer item)
	{
		return getAttemptCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute. 
	 * @return the attemptCount
	 */
	public int getAttemptCountAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Integer value = getAttemptCount( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute. 
	 * @return the attemptCount
	 */
	public int getAttemptCountAsPrimitive(final Customer item)
	{
		return getAttemptCountAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount
	 */
	public void setAttemptCount(final SessionContext ctx, final Customer item, final Integer value)
	{
		item.setProperty(ctx, CustomtelcoacceleratorCoreConstants.Attributes.Customer.ATTEMPTCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount
	 */
	public void setAttemptCount(final Customer item, final Integer value)
	{
		setAttemptCount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount
	 */
	public void setAttemptCount(final SessionContext ctx, final Customer item, final int value)
	{
		setAttemptCount( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount
	 */
	public void setAttemptCount(final Customer item, final int value)
	{
		setAttemptCount( getSession().getSessionContext(), item, value );
	}
	
	public Accessory createAccessory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CustomtelcoacceleratorCoreConstants.TC.ACCESSORY );
			return (Accessory)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Accessory : "+e.getMessage(), 0 );
		}
	}
	
	public Accessory createAccessory(final Map attributeValues)
	{
		return createAccessory( getSession().getSessionContext(), attributeValues );
	}
	
	public ClassificationNotBlankConstraint createClassificationNotBlankConstraint(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CustomtelcoacceleratorCoreConstants.TC.CLASSIFICATIONNOTBLANKCONSTRAINT );
			return (ClassificationNotBlankConstraint)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ClassificationNotBlankConstraint : "+e.getMessage(), 0 );
		}
	}
	
	public ClassificationNotBlankConstraint createClassificationNotBlankConstraint(final Map attributeValues)
	{
		return createClassificationNotBlankConstraint( getSession().getSessionContext(), attributeValues );
	}
	
	public Device createDevice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CustomtelcoacceleratorCoreConstants.TC.DEVICE );
			return (Device)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Device : "+e.getMessage(), 0 );
		}
	}
	
	public Device createDevice(final Map attributeValues)
	{
		return createDevice( getSession().getSessionContext(), attributeValues );
	}
	
	public Organisation createOrganisation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CustomtelcoacceleratorCoreConstants.TC.ORGANISATION );
			return (Organisation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Organisation : "+e.getMessage(), 0 );
		}
	}
	
	public Organisation createOrganisation(final Map attributeValues)
	{
		return createOrganisation( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductReferencesAndClassificationsComponent createProductReferencesAndClassificationsComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CustomtelcoacceleratorCoreConstants.TC.PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENT );
			return (ProductReferencesAndClassificationsComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductReferencesAndClassificationsComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductReferencesAndClassificationsComponent createProductReferencesAndClassificationsComponent(final Map attributeValues)
	{
		return createProductReferencesAndClassificationsComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductReferencesAndClassificationsForDevicesComponent createProductReferencesAndClassificationsForDevicesComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CustomtelcoacceleratorCoreConstants.TC.PRODUCTREFERENCESANDCLASSIFICATIONSFORDEVICESCOMPONENT );
			return (ProductReferencesAndClassificationsForDevicesComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductReferencesAndClassificationsForDevicesComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductReferencesAndClassificationsForDevicesComponent createProductReferencesAndClassificationsForDevicesComponent(final Map attributeValues)
	{
		return createProductReferencesAndClassificationsForDevicesComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ServiceAddOn createServiceAddOn(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CustomtelcoacceleratorCoreConstants.TC.SERVICEADDON );
			return (ServiceAddOn)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ServiceAddOn : "+e.getMessage(), 0 );
		}
	}
	
	public ServiceAddOn createServiceAddOn(final Map attributeValues)
	{
		return createServiceAddOn( getSession().getSessionContext(), attributeValues );
	}
	
	public ServicePlan createServicePlan(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CustomtelcoacceleratorCoreConstants.TC.SERVICEPLAN );
			return (ServicePlan)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ServicePlan : "+e.getMessage(), 0 );
		}
	}
	
	public ServicePlan createServicePlan(final Map attributeValues)
	{
		return createServicePlan( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return CustomtelcoacceleratorCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.organisations</code> attribute.
	 * @return the organisations
	 */
	public Collection<Organisation> getOrganisations(final SessionContext ctx, final Customer item)
	{
		final List<Organisation> items = item.getLinkedItems( 
			ctx,
			true,
			CustomtelcoacceleratorCoreConstants.Relations.CUSTOMER2ORGANISATION,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.organisations</code> attribute.
	 * @return the organisations
	 */
	public Collection<Organisation> getOrganisations(final Customer item)
	{
		return getOrganisations( getSession().getSessionContext(), item );
	}
	
	public long getOrganisationsCount(final SessionContext ctx, final Customer item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			CustomtelcoacceleratorCoreConstants.Relations.CUSTOMER2ORGANISATION,
			null
		);
	}
	
	public long getOrganisationsCount(final Customer item)
	{
		return getOrganisationsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.organisations</code> attribute. 
	 * @param value the organisations
	 */
	public void setOrganisations(final SessionContext ctx, final Customer item, final Collection<Organisation> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			CustomtelcoacceleratorCoreConstants.Relations.CUSTOMER2ORGANISATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2ORGANISATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.organisations</code> attribute. 
	 * @param value the organisations
	 */
	public void setOrganisations(final Customer item, final Collection<Organisation> value)
	{
		setOrganisations( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to organisations. 
	 * @param value the item to add to organisations
	 */
	public void addToOrganisations(final SessionContext ctx, final Customer item, final Organisation value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			CustomtelcoacceleratorCoreConstants.Relations.CUSTOMER2ORGANISATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2ORGANISATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to organisations. 
	 * @param value the item to add to organisations
	 */
	public void addToOrganisations(final Customer item, final Organisation value)
	{
		addToOrganisations( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from organisations. 
	 * @param value the item to remove from organisations
	 */
	public void removeFromOrganisations(final SessionContext ctx, final Customer item, final Organisation value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			CustomtelcoacceleratorCoreConstants.Relations.CUSTOMER2ORGANISATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2ORGANISATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from organisations. 
	 * @param value the item to remove from organisations
	 */
	public void removeFromOrganisations(final Customer item, final Organisation value)
	{
		removeFromOrganisations( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassAttributeAssignment.productReferencesAndClassificationsComponents</code> attribute.
	 * @return the productReferencesAndClassificationsComponents
	 */
	public Collection<ProductReferencesAndClassificationsComponent> getProductReferencesAndClassificationsComponents(final SessionContext ctx, final ClassAttributeAssignment item)
	{
		return PRODUCTACCESSORYCOMPONENT2CLASSATTRIBUTEASSIGNRELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassAttributeAssignment.productReferencesAndClassificationsComponents</code> attribute.
	 * @return the productReferencesAndClassificationsComponents
	 */
	public Collection<ProductReferencesAndClassificationsComponent> getProductReferencesAndClassificationsComponents(final ClassAttributeAssignment item)
	{
		return getProductReferencesAndClassificationsComponents( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassAttributeAssignment.productReferencesAndClassificationsComponents</code> attribute. 
	 * @param value the productReferencesAndClassificationsComponents
	 */
	public void setProductReferencesAndClassificationsComponents(final SessionContext ctx, final ClassAttributeAssignment item, final Collection<ProductReferencesAndClassificationsComponent> value)
	{
		PRODUCTACCESSORYCOMPONENT2CLASSATTRIBUTEASSIGNRELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassAttributeAssignment.productReferencesAndClassificationsComponents</code> attribute. 
	 * @param value the productReferencesAndClassificationsComponents
	 */
	public void setProductReferencesAndClassificationsComponents(final ClassAttributeAssignment item, final Collection<ProductReferencesAndClassificationsComponent> value)
	{
		setProductReferencesAndClassificationsComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productReferencesAndClassificationsComponents. 
	 * @param value the item to add to productReferencesAndClassificationsComponents
	 */
	public void addToProductReferencesAndClassificationsComponents(final SessionContext ctx, final ClassAttributeAssignment item, final ProductReferencesAndClassificationsComponent value)
	{
		PRODUCTACCESSORYCOMPONENT2CLASSATTRIBUTEASSIGNRELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productReferencesAndClassificationsComponents. 
	 * @param value the item to add to productReferencesAndClassificationsComponents
	 */
	public void addToProductReferencesAndClassificationsComponents(final ClassAttributeAssignment item, final ProductReferencesAndClassificationsComponent value)
	{
		addToProductReferencesAndClassificationsComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productReferencesAndClassificationsComponents. 
	 * @param value the item to remove from productReferencesAndClassificationsComponents
	 */
	public void removeFromProductReferencesAndClassificationsComponents(final SessionContext ctx, final ClassAttributeAssignment item, final ProductReferencesAndClassificationsComponent value)
	{
		PRODUCTACCESSORYCOMPONENT2CLASSATTRIBUTEASSIGNRELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productReferencesAndClassificationsComponents. 
	 * @param value the item to remove from productReferencesAndClassificationsComponents
	 */
	public void removeFromProductReferencesAndClassificationsComponents(final ClassAttributeAssignment item, final ProductReferencesAndClassificationsComponent value)
	{
		removeFromProductReferencesAndClassificationsComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComposedType.productReferencesAndClassificationsComponents</code> attribute.
	 * @return the productReferencesAndClassificationsComponents
	 */
	public Collection<ProductReferencesAndClassificationsComponent> getProductReferencesAndClassificationsComponents(final SessionContext ctx, final ComposedType item)
	{
		return PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENT2TARGETITEMTYPERELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComposedType.productReferencesAndClassificationsComponents</code> attribute.
	 * @return the productReferencesAndClassificationsComponents
	 */
	public Collection<ProductReferencesAndClassificationsComponent> getProductReferencesAndClassificationsComponents(final ComposedType item)
	{
		return getProductReferencesAndClassificationsComponents( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComposedType.productReferencesAndClassificationsComponents</code> attribute. 
	 * @param value the productReferencesAndClassificationsComponents
	 */
	public void setProductReferencesAndClassificationsComponents(final SessionContext ctx, final ComposedType item, final Collection<ProductReferencesAndClassificationsComponent> value)
	{
		PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENT2TARGETITEMTYPERELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComposedType.productReferencesAndClassificationsComponents</code> attribute. 
	 * @param value the productReferencesAndClassificationsComponents
	 */
	public void setProductReferencesAndClassificationsComponents(final ComposedType item, final Collection<ProductReferencesAndClassificationsComponent> value)
	{
		setProductReferencesAndClassificationsComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productReferencesAndClassificationsComponents. 
	 * @param value the item to add to productReferencesAndClassificationsComponents
	 */
	public void addToProductReferencesAndClassificationsComponents(final SessionContext ctx, final ComposedType item, final ProductReferencesAndClassificationsComponent value)
	{
		PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENT2TARGETITEMTYPERELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productReferencesAndClassificationsComponents. 
	 * @param value the item to add to productReferencesAndClassificationsComponents
	 */
	public void addToProductReferencesAndClassificationsComponents(final ComposedType item, final ProductReferencesAndClassificationsComponent value)
	{
		addToProductReferencesAndClassificationsComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productReferencesAndClassificationsComponents. 
	 * @param value the item to remove from productReferencesAndClassificationsComponents
	 */
	public void removeFromProductReferencesAndClassificationsComponents(final SessionContext ctx, final ComposedType item, final ProductReferencesAndClassificationsComponent value)
	{
		PRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENT2TARGETITEMTYPERELPRODUCTREFERENCESANDCLASSIFICATIONSCOMPONENTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productReferencesAndClassificationsComponents. 
	 * @param value the item to remove from productReferencesAndClassificationsComponents
	 */
	public void removeFromProductReferencesAndClassificationsComponents(final ComposedType item, final ProductReferencesAndClassificationsComponent value)
	{
		removeFromProductReferencesAndClassificationsComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute.
	 * @return the status
	 */
	public Boolean isStatus(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, CustomtelcoacceleratorCoreConstants.Attributes.Customer.STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute.
	 * @return the status
	 */
	public Boolean isStatus(final Customer item)
	{
		return isStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute. 
	 * @return the status
	 */
	public boolean isStatusAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isStatus( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute. 
	 * @return the status
	 */
	public boolean isStatusAsPrimitive(final Customer item)
	{
		return isStatusAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, CustomtelcoacceleratorCoreConstants.Attributes.Customer.STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final Customer item, final Boolean value)
	{
		setStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final Customer item, final boolean value)
	{
		setStatus( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final Customer item, final boolean value)
	{
		setStatus( getSession().getSessionContext(), item, value );
	}
	
}
