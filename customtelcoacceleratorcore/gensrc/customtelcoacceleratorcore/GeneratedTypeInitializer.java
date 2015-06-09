

package customtelcoacceleratorcore;

import java.util.*;
import java.io.Serializable;
import de.hybris.platform.util.*;
import de.hybris.platform.core.*;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.type.*;
import de.hybris.platform.persistence.type.*;
import de.hybris.platform.persistence.enumeration.*;
import de.hybris.platform.persistence.property.PersistenceManager;
import de.hybris.platform.persistence.*;

/**
 * Generated by hybris Platform.
 */
@SuppressWarnings({"cast","unused","boxing","null", "PMD"})
public class GeneratedTypeInitializer extends AbstractTypeInitializer
{
	/**
	 * Generated by hybris Platform.
	 */
	public GeneratedTypeInitializer( ManagerEJB manager, Map params )
	{
		super( manager, params );
	}


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected void performRemoveObjects( ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// no-op by now
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateTypes
	
	
		createItemType(
			"ProductReferencesAndClassificationsComponent",
			"ProductReferencesComponent",
			com.epam.training.core.jalo.ProductReferencesAndClassificationsComponent.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"ProductReferencesAndClassificationsForDevicesComponent",
			"ProductReferencesAndClassificationsComponent",
			com.epam.training.core.jalo.ProductReferencesAndClassificationsForDevicesComponent.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"Device",
			"Product",
			com.epam.training.core.jalo.Device.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"Accessory",
			"Product",
			com.epam.training.core.jalo.Accessory.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"ServicePlan",
			"SubscriptionProduct",
			com.epam.training.core.jalo.ServicePlan.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"ServiceAddOn",
			"SubscriptionProduct",
			com.epam.training.core.jalo.ServiceAddOn.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"ClassificationNotBlankConstraint",
			"TypeConstraint",
			com.epam.training.core.jalo.ClassificationNotBlankConstraint.class,
			null,
			false,
			null,
			false
		);
	
		createRelationType(
			"ProductAccessoryComponent2ClassAttributeAssignRel",
			null,
			true
		);
	
		createRelationType(
			"ProductReferencesAndClassificationsComponent2TargetItemTypeRel",
			null,
			true
		);
	
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performModifyTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performModifyTypes
	

	
	
				single_createattr_ClassificationNotBlankConstraint_category();
			
				single_createattr_ClassificationNotBlankConstraint_classification();
			
		createRelationAttributes(
			"ProductAccessoryComponent2ClassAttributeAssignRel", 
			false, 

			"productReferencesAndClassificationsComponents", 
			"ProductReferencesAndClassificationsComponent", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			false,
			CollectionType.COLLECTION,
			"classAttributeAssignment", 
			"ClassAttributeAssignment", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			false,
			false,
			CollectionType.COLLECTION
		);
	
		createRelationAttributes(
			"ProductReferencesAndClassificationsComponent2TargetItemTypeRel", 
			false, 

			"productReferencesAndClassificationsComponents", 
			"ProductReferencesAndClassificationsComponent", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			false,
			CollectionType.COLLECTION,
			"targetItemType", 
			"ComposedType", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			false,
			false,
			CollectionType.COLLECTION
		);
	
				single_createattr_Accessory_soldIndividually();
			
				single_createattr_ClassificationNotBlankConstraint_annotation();
			

	}

	
	public void single_createattr_Accessory_soldIndividually() throws JaloBusinessException
	{
		
				redeclareAttribute(
					"Accessory", 
					"soldIndividually",
					"java.lang.Boolean",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.INITIAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG
				);
			
	}
	
	public void single_createattr_ClassificationNotBlankConstraint_category() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ClassificationNotBlankConstraint", 
					"category",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ClassificationNotBlankConstraint_classification() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ClassificationNotBlankConstraint", 
					"classification",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ClassificationNotBlankConstraint_annotation() throws JaloBusinessException
	{
		
				redeclareAttribute(
					"ClassificationNotBlankConstraint", 
					"annotation",
					"java.lang.Class",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.INITIAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG
				);
			
	}
	


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateObjects( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateObjects
	
	
		createEnumerationValues(
			"SiteChannel",
			false,
			Arrays.asList( new String[] {
			
				"Telco"
			} )
		);
	
		single_setRelAttributeProperties_ProductAccessoryComponent2ClassAttributeAssignRel_source();
	
		single_setRelAttributeProperties_ProductReferencesAndClassificationsComponent2TargetItemTypeRel_source();
	
		single_setRelAttributeProperties_ProductAccessoryComponent2ClassAttributeAssignRel_target();
	
		single_setRelAttributeProperties_ProductReferencesAndClassificationsComponent2TargetItemTypeRel_target();
	
		connectRelation(
			"ProductAccessoryComponent2ClassAttributeAssignRel", 
			false, 
			"productReferencesAndClassificationsComponents", 
			"ProductReferencesAndClassificationsComponent", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			"classAttributeAssignment", 
			"ClassAttributeAssignment", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			true
		);
	
		connectRelation(
			"ProductReferencesAndClassificationsComponent2TargetItemTypeRel", 
			false, 
			"productReferencesAndClassificationsComponents", 
			"ProductReferencesAndClassificationsComponent", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			"targetItemType", 
			"ComposedType", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			true
		);
	
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ProductReferencesAndClassificationsComponent",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ProductReferencesAndClassificationsForDevicesComponent",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"Device",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"Accessory",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_Accessory_soldIndividually();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ServicePlan",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ServiceAddOn",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ClassificationNotBlankConstraint",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_ClassificationNotBlankConstraint_category();
		
			single_setAttributeProperties_ClassificationNotBlankConstraint_classification();
		
			single_setAttributeProperties_ClassificationNotBlankConstraint_annotation();
		
				changeMetaType(
					"SiteChannel",
					null,
					null
				);
			
	}


		
						public void single_setAttributeProperties_Accessory_soldIndividually() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Accessory", 
								"soldIndividually",
								false, 
								Boolean.valueOf(true),
								"Boolean.valueOf(true)",
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ClassificationNotBlankConstraint_category() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ClassificationNotBlankConstraint", 
								"category",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ClassificationNotBlankConstraint_classification() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ClassificationNotBlankConstraint", 
								"classification",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ClassificationNotBlankConstraint_annotation() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ClassificationNotBlankConstraint", 
								"annotation",
								false, 
								
	                        com.epam.training.core.constraints.ClassificationNotBlank.class
	                    ,
								"com.epam.training.core.constraints.ClassificationNotBlank.class",
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
								public void single_setRelAttributeProperties_ProductAccessoryComponent2ClassAttributeAssignRel_source() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"ClassAttributeAssignment", 
										"productReferencesAndClassificationsComponents",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_ProductAccessoryComponent2ClassAttributeAssignRel_target() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"ProductReferencesAndClassificationsComponent", 
										"classAttributeAssignment",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_ProductReferencesAndClassificationsComponent2TargetItemTypeRel_source() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"ComposedType", 
										"productReferencesAndClassificationsComponents",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_ProductReferencesAndClassificationsComponent2TargetItemTypeRel_target() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"ProductReferencesAndClassificationsComponent", 
										"targetItemType",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
}

	