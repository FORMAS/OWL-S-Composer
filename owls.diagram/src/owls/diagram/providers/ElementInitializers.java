package owls.diagram.providers;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.mindswap.owls.grounding.AtomicGrounding;
import org.mindswap.owls.grounding.AtomicGroundingList;
import org.mindswap.owls.grounding.Grounding;
import org.mindswap.owls.process.Binding;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.InputBindingList;
import org.mindswap.owls.process.InputList;
import org.mindswap.owls.process.Output;
import org.mindswap.owls.process.OutputList;
import org.mindswap.owls.process.Perform;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;

import owls.OwlsAnyOrder;
import owls.OwlsAtomicProcess;
import owls.OwlsCompositeProcess;
import owls.OwlsControlConstruct;
import owls.OwlsInput;
import owls.OwlsInputClientMessage;
import owls.OwlsOutput;
import owls.OwlsOutputClientMessage;
import owls.OwlsPackage;
import owls.OwlsPeform;
import owls.OwlsProcess;
import owls.OwlsSequence;
import owls.OwlsService;
import owls.OwlsSplit;
import owls.OwlsWsdlAtomicProcessGrounding;
import owls.OwlsWsdlGrounding;
import owls.diagram.expressions.OwlsAbstractExpression;
import owls.diagram.part.OwlsDiagramEditor;
import owls.diagram.part.OwlsDiagramEditorPlugin;
import owls.facade.OwlsKBFacade;
import owls.impl.OwlsFactoryImpl;

/**
 * @generated
 */
public class ElementInitializers {

	public ElementInitializers() {
	}

	/**
	 * @generated
	 */
	public static class Initializers {

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsSequence_1001 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsSequence()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Elements(),
						new OwlsAbstractExpression(OwlsPackage.eINSTANCE
								.getOwlsSequence()) {

							protected Object doEvaluate(Object context, Map env) {
								OwlsSequence self = (OwlsSequence) context;
								return Java.InitialElementsSequence(self);
							}
						}));
			}
		};

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsSplit_1002 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsSplit()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Elements(),
						new OwlsAbstractExpression(OwlsPackage.eINSTANCE
								.getOwlsSplit()) {

							protected Object doEvaluate(Object context, Map env) {
								OwlsSplit self = (OwlsSplit) context;
								return Java.InitialElementsSplit(self);
							}
						}));
			}
		};

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsAnyOrder_1003 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsAnyOrder()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Elements(),
						new OwlsAbstractExpression(OwlsPackage.eINSTANCE
								.getOwlsAnyOrder()) {

							protected Object doEvaluate(Object context, Map env) {
								OwlsAnyOrder self = (OwlsAnyOrder) context;
								return Java.InitialElementsAnyOrder(self);
							}
						}));
			}
		};

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsAtomicProcess_2001 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsAtomicProcess()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsProcess_ID(), new OwlsAbstractExpression(
						OwlsPackage.eINSTANCE.getOwlsAtomicProcess()) {

					protected Object doEvaluate(Object context, Map env) {
						OwlsAtomicProcess self = (OwlsAtomicProcess) context;
						return Java._IDAtomicProcessValue(self);
					}
				}));
				add(createNewElementFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsProcess_PeformedBy(),
						new ObjectInitializer[] { peformedBy(), }));
				add(createNewElementFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsProcess_Describes(),
						new ObjectInitializer[] { describes(), }));
			}

			ObjectInitializer peformedBy() {
				return new ObjectInitializer(OwlsPackage.eINSTANCE
						.getOwlsPeform()) {

					protected void init() {
						add(createExpressionFeatureInitializer(
								OwlsPackage.eINSTANCE.getOwlsPeform_ID(),
								new OwlsAbstractExpression(
										OwlsPackage.eINSTANCE.getOwlsPeform()) {

									protected Object doEvaluate(Object context,
											Map env) {
										OwlsPeform self = (OwlsPeform) context;
										return Java._IDAtomicPeformValue(self);
									}
								}));
					}
				};
			}

			ObjectInitializer describes() {
				return new ObjectInitializer(OwlsPackage.eINSTANCE
						.getOwlsService()) {

					protected void init() {
						add(createExpressionFeatureInitializer(
								OwlsPackage.eINSTANCE.getOwlsService_ID(),
								new OwlsAbstractExpression(
										OwlsPackage.eINSTANCE.getOwlsService()) {

									protected Object doEvaluate(Object context,
											Map env) {
										OwlsService self = (OwlsService) context;
										return Java._IDAtomicServiceValue(self);
									}
								}));
						add(createNewElementFeatureInitializer(
								OwlsPackage.eINSTANCE.getOwlsService_Supports(),
								new ObjectInitializer[] { describes_supports(), }));
					}
				};
			}

			ObjectInitializer describes_supports() {
				return new ObjectInitializer(OwlsPackage.eINSTANCE
						.getOwlsWsdlGrounding()) {

					protected void init() {
						add(createExpressionFeatureInitializer(
								OwlsPackage.eINSTANCE.getOwlsWsdlGrounding_ID(),
								new OwlsAbstractExpression(
										OwlsPackage.eINSTANCE
												.getOwlsWsdlGrounding()) {

									protected Object doEvaluate(Object context,
											Map env) {
										OwlsWsdlGrounding self = (OwlsWsdlGrounding) context;
										return Java
												._IDAtomicWsdlGroundingValue(self);
									}
								}));
					}
				};
			}
		};

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsCompositeProcess_2002 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsCompositeProcess()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsProcess_ID(), new OwlsAbstractExpression(
						OwlsPackage.eINSTANCE.getOwlsCompositeProcess()) {

					protected Object doEvaluate(Object context, Map env) {
						OwlsCompositeProcess self = (OwlsCompositeProcess) context;
						return Java._IDCompositeProcessValue(self);
					}
				}));
				add(createNewElementFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsProcess_PeformedBy(),
						new ObjectInitializer[] { peformedBy(), }));
				add(createNewElementFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsProcess_Describes(),
						new ObjectInitializer[] { describes(), }));
			}

			ObjectInitializer peformedBy() {
				return new ObjectInitializer(OwlsPackage.eINSTANCE
						.getOwlsPeform()) {

					protected void init() {
						add(createExpressionFeatureInitializer(
								OwlsPackage.eINSTANCE.getOwlsPeform_ID(),
								new OwlsAbstractExpression(
										OwlsPackage.eINSTANCE.getOwlsPeform()) {

									protected Object doEvaluate(Object context,
											Map env) {
										OwlsPeform self = (OwlsPeform) context;
										return Java
												._IDCompositePeformValue(self);
									}
								}));
					}
				};
			}

			ObjectInitializer describes() {
				return new ObjectInitializer(OwlsPackage.eINSTANCE
						.getOwlsService()) {

					protected void init() {
						add(createExpressionFeatureInitializer(
								OwlsPackage.eINSTANCE.getOwlsService_ID(),
								new OwlsAbstractExpression(
										OwlsPackage.eINSTANCE.getOwlsService()) {

									protected Object doEvaluate(Object context,
											Map env) {
										OwlsService self = (OwlsService) context;
										return Java
												._IDCompositeServiceValue(self);
									}
								}));
						add(createNewElementFeatureInitializer(
								OwlsPackage.eINSTANCE.getOwlsService_Supports(),
								new ObjectInitializer[] { describes_supports(), }));
					}
				};
			}

			ObjectInitializer describes_supports() {
				return new ObjectInitializer(OwlsPackage.eINSTANCE
						.getOwlsWsdlGrounding()) {

					protected void init() {
						add(createExpressionFeatureInitializer(
								OwlsPackage.eINSTANCE.getOwlsWsdlGrounding_ID(),
								new OwlsAbstractExpression(
										OwlsPackage.eINSTANCE
												.getOwlsWsdlGrounding()) {

									protected Object doEvaluate(Object context,
											Map env) {
										OwlsWsdlGrounding self = (OwlsWsdlGrounding) context;
										return Java._IDWsdlGroundingValue(self);
									}
								}));
					}
				};
			}
		};

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsSplit_2003 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsSplit()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Elements(),
						new OwlsAbstractExpression(OwlsPackage.eINSTANCE
								.getOwlsSplit()) {

							protected Object doEvaluate(Object context, Map env) {
								OwlsSplit self = (OwlsSplit) context;
								return Java.InitialElementsSplit(self);
							}
						}));
			}
		};

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsSequence_2004 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsSequence()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Elements(),
						new OwlsAbstractExpression(OwlsPackage.eINSTANCE
								.getOwlsSequence()) {

							protected Object doEvaluate(Object context, Map env) {
								OwlsSequence self = (OwlsSequence) context;
								return Java.InitialElementsSequence(self);
							}
						}));
			}
		};

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsAnyOrder_2005 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsAnyOrder()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Elements(),
						new OwlsAbstractExpression(OwlsPackage.eINSTANCE
								.getOwlsAnyOrder()) {

							protected Object doEvaluate(Object context, Map env) {
								OwlsAnyOrder self = (OwlsAnyOrder) context;
								return Java.InitialElementsAnyOrder(self);
							}
						}));
			}
		};

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsInputClientMessage_2006 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsInputClientMessage()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsInputClientMessage_ClientInputs(),
						new OwlsAbstractExpression(OwlsPackage.eINSTANCE
								.getOwlsInputClientMessage()) {

							protected Object doEvaluate(Object context, Map env) {
								OwlsInputClientMessage self = (OwlsInputClientMessage) context;
								return Java.ClientInputsValues(self);
							}
						}));
			}
		};

		/**
		 * @generated
		 */
		public static final IObjectInitializer OwlsOutputClientMessage_2007 = new ObjectInitializer(
				OwlsPackage.eINSTANCE.getOwlsOutputClientMessage()) {

			protected void init() {
				add(createExpressionFeatureInitializer(OwlsPackage.eINSTANCE
						.getOwlsOutputClientMessage_ClientOutputs(),
						new OwlsAbstractExpression(OwlsPackage.eINSTANCE
								.getOwlsOutputClientMessage()) {

							protected Object doEvaluate(Object context, Map env) {
								OwlsOutputClientMessage self = (OwlsOutputClientMessage) context;
								return Java.ClientOutputsValue(self);
							}
						}));
			}
		};

		/**
		 * @generated
		 */
		private Initializers() {
		}

		/**
		 * @generated
		 */
		public static interface IObjectInitializer {

			/**
			 * @generated
			 */
			public void init(EObject instance);
		}

		/**
		 * @generated
		 */
		public static abstract class ObjectInitializer implements
				IObjectInitializer {

			/**
			 * @generated
			 */
			final EClass element;

			/**
			 * @generated
			 */
			private List featureInitializers = new ArrayList();

			/**
			 * @generated
			 */
			ObjectInitializer(EClass element) {
				this.element = element;
				init();
			}

			/**
			 * @generated
			 */
			protected abstract void init();

			/**
			 * @generated
			 */
			protected final IFeatureInitializer add(
					IFeatureInitializer initializer) {
				featureInitializers.add(initializer);
				return initializer;
			}

			/**
			 * @generated
			 */
			public void init(EObject instance) {
				for (Iterator it = featureInitializers.iterator(); it.hasNext();) {
					IFeatureInitializer nextExpr = (IFeatureInitializer) it
							.next();
					try {
						nextExpr.init(instance);
					} catch (RuntimeException e) {
						OwlsDiagramEditorPlugin.getInstance().logError(
								"Feature initialization failed", e); //$NON-NLS-1$						
					}
				}
			}
		}

		/**
		 * @generated
		 */
		interface IFeatureInitializer {

			/**
			 * @generated
			 */
			void init(EObject contextInstance);
		}

		/**
		 * @generated
		 */
		static IFeatureInitializer createNewElementFeatureInitializer(
				EStructuralFeature initFeature,
				ObjectInitializer[] newObjectInitializers) {
			final EStructuralFeature feature = initFeature;
			final ObjectInitializer[] initializers = newObjectInitializers;
			return new IFeatureInitializer() {

				public void init(EObject contextInstance) {
					for (int i = 0; i < initializers.length; i++) {
						EObject newInstance = initializers[i].element
								.getEPackage().getEFactoryInstance().create(
										initializers[i].element);
						if (feature.isMany()) {
							((Collection) contextInstance.eGet(feature))
									.add(newInstance);
						} else {
							contextInstance.eSet(feature, newInstance);
						}
						initializers[i].init(newInstance);
					}
				}
			};
		}

		/**
		 * @generated
		 */
		static IFeatureInitializer createExpressionFeatureInitializer(
				EStructuralFeature initFeature,
				OwlsAbstractExpression valueExpression) {
			final EStructuralFeature feature = initFeature;
			final OwlsAbstractExpression expression = valueExpression;
			return new IFeatureInitializer() {

				public void init(EObject contextInstance) {
					expression.assignTo(feature, contextInstance);
				}
			};
		}

		/**
		 * @generated
		 */
		static class Java {

			/*
			 * This Method's are hacks. I didn't realize how to handle a dynamic
			 * creation of Feature Seq Initializers referencing a palette entry, so, 
			 * I tried to create as much objects as possible in each corresponding method.
			 */

			/**
			 * Factory that will generate all the required EObjects.
			 * @generated NOT
			 */
			private static OwlsFactoryImpl factory = new OwlsFactoryImpl();

			/**
			 * This list will store all the imports from each diagram instance.
			 * @generated NOT
			 */
			private static List<String> importedElements = new ArrayList<String>();

			/**
			 * This list will store all the views from each diagram instance.
			 * @generated NOT
			 */
			private static List<PaletteViewer> importedViews = new ArrayList<PaletteViewer>();

			/**
			 * @generated NOT
			 */
			private static String _IDAtomicProcessValue(OwlsAtomicProcess self) {
				organizeImports();
				ToolEntry entry = getActiveTool();

				for (Object object : importedElements) {
					Service aService = getServiceForImport(object);
					Process aProcess = aService.getProcess();
					if (aProcess.getLocalName().equals(entry.getLabel())) {
						setInputs(self, aProcess);
						setOutputs(self, aProcess);
						OwlsControlConstruct cc = (OwlsControlConstruct) self
								.eContainer();
						cc.getElements().add(self);
						self.setProcessURI(aProcess.getURI().toString());
						self.setLabel(aProcess.getLabel());
						return aProcess.getLocalName();
					}
				}
				return null;
			}

			/**
			 * @generated NOT
			 */
			private static String _IDAtomicPeformValue(OwlsPeform self) {
				ToolEntry entry = getActiveTool();

				for (Object object : importedElements) {
					Service aService = getServiceForImport(object);
					Process aProcess = aService.getProcess();
					if (aProcess.getLocalName().equals(entry.getLabel())) {
						int underlineLoc = aProcess.getLocalName().indexOf("_");
						setInputBinding(self, aProcess);
						String peformName = aProcess.getLocalName().substring(
								0, underlineLoc);
						return peformName;
					}
				}
				return null;
			}

			/**
			 * @generated NOT
			 */
			private static String _IDAtomicServiceValue(OwlsService self) {
				ToolEntry entry = getActiveTool();

				for (Object object : importedElements) {
					Service aService = getServiceForImport(object);
					Process aProcess = aService.getProcess();
					if (aProcess.getLocalName().equals(entry.getLabel())) {
						return aService.getLocalName();
					}
				}
				return null;
			}

			/**
			 * @generated NOT
			 */
			private static String _IDAtomicWsdlGroundingValue(
					OwlsWsdlGrounding self) {
				ToolEntry entry = getActiveTool();

				for (Object object : importedElements) {
					Service aService = getServiceForImport(object);
					Process aProcess = aService.getProcess();
					if (aProcess.getLocalName().equals(entry.getLabel())) {
						Grounding grounding = aService.getGrounding();
						setAtomicGroundings(self, grounding);
						return grounding.getLocalName();
					}
				}
				return null;
			}

			/**
			 * @generated NOT
			 */
			private static String _IDWsdlGroundingValue(OwlsWsdlGrounding self) {
				ToolEntry entry = getActiveTool();

				for (Object object : importedElements) {
					Service aService = getServiceForImport(object);
					Process aProcess = aService.getProcess();
					if (aProcess.getLocalName().equals(entry.getLabel())) {
						Grounding grounding = aService.getGrounding();
						setAtomicGroundings(self, grounding);
						return grounding.getLocalName();
					}
				}
				return null;
			}

			/**
			 * @generated NOT
			 */
			private static EList<EObject> InitialElementsSequence(
					OwlsSequence self) {
				EObject object = (EObject) self.eContainer();
				if (object instanceof OwlsControlConstruct) {
					OwlsControlConstruct cc = (OwlsControlConstruct) object;
					cc.getElements().add(self);
				}
				return self.getElements();
			}

			/**
			 * @generated NOT
			 */
			private static EList<EObject> InitialElementsSplit(OwlsSplit self) {
				EObject object = (EObject) self.eContainer();
				if (object instanceof OwlsControlConstruct) {
					OwlsControlConstruct cc = (OwlsControlConstruct) object;
					cc.getElements().add(self);
				}
				return self.getElements();
			}

			/**
			 * @generated NOT
			 */
			private static EList<EObject> InitialElementsAnyOrder(
					OwlsAnyOrder self) {
				EObject object = (EObject) self.eContainer();
				if (object instanceof OwlsControlConstruct) {
					OwlsControlConstruct cc = (OwlsControlConstruct) object;
					cc.getElements().add(self);
				}
				return self.getElements();
			}

			/**
			 * @generated NOT
			 */
			private static EList<OwlsInput> ClientInputsValues(
					OwlsInputClientMessage self) {
				OwlsCompositeProcess rootElement = (OwlsCompositeProcess) self
						.eContainer().eContainer();
				return rootElement.getHasInputs();
			}

			/**
			 * @generated NOT
			 */
			private static EList<OwlsOutput> ClientOutputsValue(
					OwlsOutputClientMessage self) {
				OwlsCompositeProcess rootElement = (OwlsCompositeProcess) self
						.eContainer().eContainer();
				return rootElement.getHasOutputs();
			}

			/**
			 * @generated NOT
			 */
			private static String _IDCompositeProcessValue(
					OwlsCompositeProcess self) {
				organizeImports();
				ToolEntry entry = getActiveTool();

				for (Object object : importedElements) {
					Service aService = getServiceForImport(object);
					Process aProcess = aService.getProcess();
					if (aProcess.getLocalName().equals(entry.getLabel())) {
						setInputs(self, aProcess);
						setOutputs(self, aProcess);
						OwlsControlConstruct cc = (OwlsControlConstruct) self
								.eContainer();
						cc.getElements().add(self);
						self.setProcessURI(aProcess.getURI().toString());
						self.setLabel(aProcess.getLabel());
						return aProcess.getLocalName();
					}
				}
				return null;
			}

			/**
			 * @generated NOT
			 */
			private static String _IDCompositePeformValue(OwlsPeform self) {
				ToolEntry entry = getActiveTool();

				for (Object object : importedElements) {
					Service aService = getServiceForImport(object);
					Process aProcess = aService.getProcess();
					if (aProcess.getLocalName().equals(entry.getLabel())) {
						int underlineLoc = aProcess.getLocalName().indexOf("_");
						setInputBinding(self, aProcess);
						String peformName = aProcess.getLocalName().substring(
								0, underlineLoc);
						return peformName;
					}
				}
				return null;
			}

			/**
			 * @generated NOT
			 */
			private static String _IDCompositeServiceValue(OwlsService self) {
				ToolEntry entry = getActiveTool();

				for (Object object : importedElements) {
					Service aService = getServiceForImport(object);
					Process aProcess = aService.getProcess();
					if (aProcess.getLocalName().equals(entry.getLabel())) {
						return aService.getLocalName();
					}
				}
				return null;
			}

			/**
			 * @generated NOT
			 */
			private static String _IDPeformValue(OwlsPeform self) {
				ToolEntry entry = getActiveTool();

				for (Object object : importedElements) {
					Service aService = getServiceForImport(object);
					Process aProcess = aService.getProcess();
					if (aProcess.getLocalName().equals(entry.getLabel())) {
						int underlineLoc = aProcess.getLocalName().indexOf("_");
						setInputBinding(self, aProcess);
						String peformName = aProcess.getLocalName().substring(
								0, underlineLoc);
						return peformName;
					}
				}
				return null;
			}

			/**
			 * @generated NOT
			 */
			private static void setInputs(OwlsProcess self, Process aProcess) {
				InputList inputList = aProcess.getInputs();
				for (Object inObject : inputList) {
					Input input = (Input) inObject;
					OwlsInput newInput = factory.createOwlsInput();
					newInput.setID(input.getLocalName());
					newInput.setLabel(input.getLabel());
					newInput.setParameterType(input.getParamType().toString());
					self.getHasInputs().add(newInput);
				}
			}

			/**
			 * @generated NOT
			 */
			private static void setOutputs(OwlsProcess self, Process aProcess) {
				OutputList outputList = aProcess.getOutputs();
				for (Object OutObject : outputList) {
					Output output = (Output) OutObject;
					OwlsOutput newOutput = factory.createOwlsOutput();
					newOutput.setID(output.getLocalName());
					newOutput.setLabel(output.getLabel());
					newOutput
							.setParameterType(output.getParamType().toString());
					self.getHasOutputs().add(newOutput);
				}
			}

			/**
			 * @generated NOT
			 */
			private static void setInputBinding(OwlsPeform self,
					Process aProcess) {
				Perform perform = OwlsKBFacade.getKb().createPerform(
						aProcess.getURI());
				InputBindingList ibList = perform.getBindings();
				for (Object object : ibList) {
					Binding binding = (Binding) object;
				}
			}

			/**
			 * @generated NOT
			 */
			private static void setAtomicGroundings(OwlsWsdlGrounding self,
					Grounding grounding) {
				AtomicGroundingList agList = grounding.getAtomicGroundings();
				for (Object object : agList) {
					AtomicGrounding aGrounding = (AtomicGrounding) object;
					OwlsWsdlAtomicProcessGrounding newAGrounding = factory
							.createOwlsWsdlAtomicProcessGrounding();
					newAGrounding.setID(aGrounding.getLocalName());
					self.getHasAtomicProcessGrounding().add(newAGrounding);
				}
			}

			/**
			 * Creates an OWL-S service based on the indicated import.
			 * @generated NOT
			 */
			private static Service getServiceForImport(Object object) {

				Service aService = null;

				// create the URI of a known service for us to read in
				File file = new File(object.toString());
				try {
					URL aURL = file.toURI().toURL();
					String url = aURL.toString();
					aService = OwlsKBFacade.getKb().readService(url);
				} catch (MalformedURLException e1) {
					
				} catch (FileNotFoundException e2) {

				} catch (URISyntaxException e3) {

				}

				return aService;
			}

			/**
			 * This method will retrieve and store views and the imported elements from
			 * each diagram instance. This objects will be used to reference the initialization
			 * of each element in a diagram by its palette entry.
			 * @generated NOT
			 */
			public static void organizeImports() {
				PaletteViewer viewer = OwlsDiagramEditor.aEditDomain
						.getPaletteViewer();

				if (!(importedViews.contains(viewer))) {
					importedViews.add(viewer);
				}

				OwlsCompositeProcess rootElement = (OwlsCompositeProcess) OwlsDiagramEditor.aDiagramElement;
				List imports = rootElement.getDescribes().getOwnedBy()
						.getOntology().getImports();
				for (Object object : imports) {
					if (!(importedElements.contains(object))) {
						importedElements.add((String) object);
					}
				}
				return;
			}

			/**
			 * This method will retrieve a selection tool referencing its own view. 
			 * This is a workaround to support multiple diagrams with diferent
			 * palette viewers.
			 * @generated NOT
			 */
			private static ToolEntry getActiveTool() {
				for (PaletteViewer viewer : importedViews) {
					ToolEntry entry = viewer.getActiveTool();
					if (!(entry.getLabel().equals("Select"))) {
						return entry;
					}
				}
				return null;
			}

			public static EObject getRootElement(EObject self) {
				while (self.eContainer() != null) {
					self = self.eContainer();
				}
				return self;

			}

		}
	}
}
