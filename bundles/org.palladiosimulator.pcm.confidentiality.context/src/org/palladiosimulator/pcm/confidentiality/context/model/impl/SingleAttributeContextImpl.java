/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import java.util.Objects;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Attribute Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SingleAttributeContextImpl extends ContextAttributeImpl implements SingleAttributeContext {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SingleAttributeContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.SINGLE_ATTRIBUTE_CONTEXT;
    }
    
    /**
    @generated NOT
    */
    @Override
    public boolean checkAccessRight(ContextAttribute context) {
        
        if(EcoreUtil.equals(this, context))
            return true;
        if(context instanceof HierarchicalContext) {
            var hierarchicalContext = (HierarchicalContext) context;
            return hierarchicalContext.getIncluding().stream().anyMatch(this::checkAccessRight);
        }
        
        
        if(!(context instanceof SingleAttributeContext))
            return false;                   
        var contextAttribute = (SingleAttributeContext) context;
        

        
        return Objects.equals(contextAttribute.getEntityName(), this.getEntityName());
        
    }

} //SingleAttributeContextImpl
