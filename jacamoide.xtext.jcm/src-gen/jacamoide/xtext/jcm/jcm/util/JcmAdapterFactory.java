/**
 */
package jacamoide.xtext.jcm.jcm.util;

import jacamoide.xtext.jcm.jcm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jacamoide.xtext.jcm.jcm.JcmPackage
 * @generated
 */
public class JcmAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JcmPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JcmAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JcmPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JcmSwitch<Adapter> modelSwitch =
    new JcmSwitch<Adapter>()
    {
      @Override
      public Adapter caseJcmModel(JcmModel object)
      {
        return createJcmModelAdapter();
      }
      @Override
      public Adapter caseDUses(DUses object)
      {
        return createDUsesAdapter();
      }
      @Override
      public Adapter caseDClassPath(DClassPath object)
      {
        return createDClassPathAdapter();
      }
      @Override
      public Adapter caseDAslPath(DAslPath object)
      {
        return createDAslPathAdapter();
      }
      @Override
      public Adapter caseDPlatform(DPlatform object)
      {
        return createDPlatformAdapter();
      }
      @Override
      public Adapter caseDNode(DNode object)
      {
        return createDNodeAdapter();
      }
      @Override
      public Adapter caseAgent(Agent object)
      {
        return createAgentAdapter();
      }
      @Override
      public Adapter caseWorkspace(Workspace object)
      {
        return createWorkspaceAdapter();
      }
      @Override
      public Adapter caseArtifact(Artifact object)
      {
        return createArtifactAdapter();
      }
      @Override
      public Adapter caseOrganisation(Organisation object)
      {
        return createOrganisationAdapter();
      }
      @Override
      public Adapter caseOFileName(OFileName object)
      {
        return createOFileNameAdapter();
      }
      @Override
      public Adapter caseONode(ONode object)
      {
        return createONodeAdapter();
      }
      @Override
      public Adapter caseOAgents(OAgents object)
      {
        return createOAgentsAdapter();
      }
      @Override
      public Adapter caseOOthers(OOthers object)
      {
        return createOOthersAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter caseScheme(Scheme object)
      {
        return createSchemeAdapter();
      }
      @Override
      public Adapter caseHost(Host object)
      {
        return createHostAdapter();
      }
      @Override
      public Adapter caseFileName(FileName object)
      {
        return createFileNameAdapter();
      }
      @Override
      public Adapter caseClassDef(ClassDef object)
      {
        return createClassDefAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseListParameters(ListParameters object)
      {
        return createListParametersAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter casePred(Pred object)
      {
        return createPredAdapter();
      }
      @Override
      public Adapter caseTerms(Terms object)
      {
        return createTermsAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseVar(Var object)
      {
        return createVarAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.JcmModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.JcmModel
   * @generated
   */
  public Adapter createJcmModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.DUses <em>DUses</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.DUses
   * @generated
   */
  public Adapter createDUsesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.DClassPath <em>DClass Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.DClassPath
   * @generated
   */
  public Adapter createDClassPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.DAslPath <em>DAsl Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.DAslPath
   * @generated
   */
  public Adapter createDAslPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.DPlatform <em>DPlatform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.DPlatform
   * @generated
   */
  public Adapter createDPlatformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.DNode <em>DNode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.DNode
   * @generated
   */
  public Adapter createDNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Agent
   * @generated
   */
  public Adapter createAgentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Workspace <em>Workspace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Workspace
   * @generated
   */
  public Adapter createWorkspaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Artifact
   * @generated
   */
  public Adapter createArtifactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Organisation <em>Organisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Organisation
   * @generated
   */
  public Adapter createOrganisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.OFileName <em>OFile Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.OFileName
   * @generated
   */
  public Adapter createOFileNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.ONode <em>ONode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.ONode
   * @generated
   */
  public Adapter createONodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.OAgents <em>OAgents</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.OAgents
   * @generated
   */
  public Adapter createOAgentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.OOthers <em>OOthers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.OOthers
   * @generated
   */
  public Adapter createOOthersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Scheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Scheme
   * @generated
   */
  public Adapter createSchemeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Host <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Host
   * @generated
   */
  public Adapter createHostAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.FileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.FileName
   * @generated
   */
  public Adapter createFileNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.ClassDef <em>Class Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.ClassDef
   * @generated
   */
  public Adapter createClassDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.ListParameters <em>List Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.ListParameters
   * @generated
   */
  public Adapter createListParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Pred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Pred
   * @generated
   */
  public Adapter createPredAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Terms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Terms
   * @generated
   */
  public Adapter createTermsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jacamoide.xtext.jcm.jcm.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jacamoide.xtext.jcm.jcm.Var
   * @generated
   */
  public Adapter createVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JcmAdapterFactory
