package emf_syncer;

import java.util.Collection;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.Pair;

@Aspect
public class GetterAspect {
	static Syncer syncer = null;
	
	// when initializing many-valued features, a get is performed
	// we need this variable to control that initilize is only applied 
	// at the top level (first get)
	private int getLevel = 0;
	private int colLevel = 0;
	
	// TO BE UPDATED: where model classes are
	@Pointcut("within(tpcds.tpcdsModel.impl.*) || within(tpcds.gen.q1.impl.*) ||within(emf.sm.impl.*)")
	// END TO BE UPDATED 
	private void syntacticScope() {}

	
	@Pointcut("within(emf_syncer.Syncer) && (execution(* initialSync(..)) || execution(* initialSyncParallel(..)))")
	private void initializationScope() {}

	

	// //////////////////////////////////////////////////////////////
	// DO NOT MODIFY BELOW
	// //////////////////////////////////////////////////////////////

//	@After("within(emf_syncer.Syncer) && execution(* eagerSync(..))")
	@Before("initializationScope()")
	public void getSyncer(JoinPoint thisJoinPoint) {
		syncer = (Syncer) thisJoinPoint.getThis(); 
	}
	
	
	@Around(
		"syntacticScope() && target(org.eclipse.emf.ecore.EObject) && execution(* *..get* (..))"
	) 
	public Object featureGetCall(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		Object currentValue = thisJoinPoint.proceed();
		Object newResult = currentValue;
		if (syncer != null) {
			
			if (getLevel==0) {
				getLevel++;
	
				boolean isDefaultValue = syncer.getJavaToEmfSyncer().getUtil().isDefaultValue(currentValue);
				
				EObject eObj = null;
				String featureName = "";

				if (isDefaultValue) {
					eObj = (EObject) thisJoinPoint.getTarget();
					featureName = thisJoinPoint.getSignature().getName();
					featureName = decapitalize(featureName.substring(3, featureName.length()));
					
					EStructuralFeature stFeature = eObj.eClass().getEStructuralFeature(featureName);
					
					if (!eObj.eClass().getName().equals("EPackage")) {
//						boolean isSet = eObj.eIsSet(stFeature);
//						if (!isSet) {
						Object jObj = syncer.getEmfToJavaSyncer().getObject(eObj);
						if (jObj != null) { // eObj may correspond to an EPackage, when getting classifiers
							newResult = syncer.getJavaToEmfSyncer().initFeature(eObj, jObj, stFeature, currentValue);
						}
//						} 
					}
				
				}		
				if (syncer.isTrackingUpdates()) { // applying updates
					if (eObj == null) {
						eObj = (EObject) thisJoinPoint.getTarget();
						featureName = thisJoinPoint.getSignature().getName();
						featureName = decapitalize(featureName.substring(3, featureName.length()));
					}
					if (newResult instanceof Collection<?>) { // many structural feature
						syncer.getTrackedCollections().put((Collection<?>) newResult, new Pair<>(eObj, featureName));
					}
				}							
				getLevel--;
			}
		}
		return newResult;
	}
	
	
	
	
//	
//	// WORKING
//	@Around(
//			"syntacticScope() && target(org.eclipse.emf.ecore.EObject) && execution(* *..get* (..))"
//			) 
//	public Object featureGetCall(ProceedingJoinPoint thisJoinPoint) throws Throwable {
//		Object currentValue = thisJoinPoint.proceed();
//		Object newResult = currentValue;
//		if (syncer != null) {
//			
//			if (getLevel==0) {
//				getLevel++;
//				
//				
////				// TODO: mapping of default values
////				boolean isDefaultValue = false;
//////				if ((result == null) ) { // references
////					if ((currentValue == null) || ((currentValue instanceof Collection<?>) && ((Collection<?>)currentValue).isEmpty())) { // references
////					isDefaultValue = true;
////				} else { // attributes
////					
////					if (currentValue instanceof java.lang.String) {
////						if (currentValue == "") isDefaultValue = true;
////					} else if (currentValue instanceof java.lang.Double) {
////						if ((Double)currentValue == 0.0) isDefaultValue = true;
////					} else if (currentValue instanceof java.lang.Long) {
////						if ((Long)currentValue == 0) isDefaultValue = true;
////					} else if (currentValue instanceof java.lang.Integer) {
////						if ((Integer)currentValue == 0) isDefaultValue = true;
////					}
////		
////				}
////		
////				if (isDefaultValue) { // it may not have been initialized
////					System.out.println("in getter: result (before) = " + result);
//				
//				EObject eObj = (EObject) thisJoinPoint.getTarget();
//				String featureName = thisJoinPoint.getSignature().getName();
//				featureName = decapitalize(featureName.substring(3, featureName.length()));
////						if (!syncer.getJavaToEmfSyncer().isInitialized(eObj, featureName)) {
//				
//				if (!eObj.eClass().getName().equals("EPackage")) {
//					EStructuralFeature stFeature = eObj.eClass().getEStructuralFeature(featureName);
//					boolean isSet = eObj.eIsSet(stFeature);
//					
//					if (!isSet) {
//						
//						Object jObj = syncer.getEmfToJavaSyncer().getObject(eObj);
//						if (jObj != null) { // eObj may correspond to an EPackage, when getting classifiers
//							
////										System.out.println("GETTER isSynced?" + syncer.isSynced());
//							if (syncer.isTrackingUpdates()) { // applying updates
////											System.out.println("GETTER feature isMany?" + stFeature.isMany() + ", isReference?" + (stFeature instanceof EReference));
//								if ((stFeature instanceof EReference) && (stFeature.isMany())) {
////												System.out.println("GETTER " + featureName + ": tracking collection");
//									syncer.getTrackedCollections().put((Collection<?>)eObj.eGet(stFeature), new Pair<>(eObj, featureName));
//								}
//							} else {
////											System.out.println("FROM ASPECT: " + featureName + " - current value: " + currentValue);
//								newResult = syncer.getJavaToEmfSyncer().initFeature(eObj, jObj, stFeature, currentValue);
////											System.out.println("is newResult null? " + (newResult == null));
//								
//							}
//						}
//					}
//				}
////						}
//				
//				
////					}
//				//				System.out.println("in getter: result (after) = " + newResult);
//				getLevel--;
//			}
//		}
//		return newResult;
//	}
	
	
	
	
	
//	@After("syntacticScope() && !cflowbelow(initializationScope()) && target(org.eclipse.emf.ecore.EObject) && (execution(* *..set* (..)) || execution(* *..unset* (..)))") 
//	public void featureSetCall(JoinPoint thisJoinPoint) {
//		if (syncer != null) {
////			System.out.println("	in featureSetCall - is tracking updates? " + syncer.isTrackingUpdates());
//			
//			if (syncer.isTrackingUpdates()) {
//				
////				System.out.println("	in getter " + thisJoinPoint.getSignature().getName());
//				
//				EObject eObj = (EObject) thisJoinPoint.getTarget();
//				
//				Object jObj = syncer.getEmfToJavaSyncer().getObject(eObj);
//				if (jObj != null) { 
////					System.out.println("	in getter " + thisJoinPoint.getSignature().getName() + " of objec " + jObj.toString());
//					String featureName = thisJoinPoint.getSignature().getName();
//					featureName = decapitalize(getFeatureName(featureName));
//					syncer.getEmfToJavaSyncer().addFeatureCall(eObj, featureName);
//					
//					// has opposite
//					EStructuralFeature stFeature = eObj.eClass().getEStructuralFeature(featureName);
//					if ((stFeature != null) && (stFeature instanceof EReference)) {
//						EReference ref = (EReference) stFeature;
//						if (ref.getEOpposite() != null) {
//							if (ref.isMany()) {
//								Collection<EObject> col = (Collection<EObject>) eObj.eGet(ref);
//								for (EObject targetEObj: col) {
//									syncer.getEmfToJavaSyncer().addFeatureCall(targetEObj, ref.getEOpposite().getName());
//								}
//							} else {
//								EObject targetEObj = (EObject) eObj.eGet(ref);
//								syncer.getEmfToJavaSyncer().addFeatureCall(targetEObj, ref.getEOpposite().getName());
//							}
//						}
//					}
//				}
//			}
//		}
//	}
//	
//	
//	//target(java.util.Collection) && within(java.util.*) && !cflowbelow(initializationScope())
//	@After("within(java.util.*) || !cflowbelow(initializationScope()) && target(java.util.Collection) "
//			+ "&& ("
//				+ "call(* java.util.Collection.add(..)) || "
//				+ "call(* java.util.Collection.addAll(..)) ||"
//				+ "call(* java.util.Collection.remove(..)) ||"
//				+ "call(* java.util.Collection.removeAll(..)) ||"
//				+ "call(* java.util.Collection.clear(..)) ||"
//				+ "call(* java.util.Collection.retainAll(..))"
//			+ ")") 
//	public void collectionModification(JoinPoint thisJoinPoint) {
//		if (colLevel==0) {
//			colLevel++;
//			
//			if (syncer != null) {
//				if (syncer.isTrackingUpdates()) {
////					System.out.println("COLLECTION operation detected: ");
//					Collection<?> col = (Collection<?>) thisJoinPoint.getTarget();
//					Pair<EObject,String> pair = syncer.getTrackedCollections().get(col);
////					System.out.println("COLLECTION: tracked collections: " + syncer.getTrackedCollections().toString());
//					if (pair != null) {
////						System.out.println("COLLECTION: " + pair.getValue().getName());
//						syncer.getEmfToJavaSyncer().addFeatureCall(pair.getKey(), pair.getValue());
//						syncer.getTrackedCollections().remove(col);
//					}
//				}
//			}
//			
//			colLevel--;
//		}
//	}
	
	
	@Pointcut("(execution(* emf_syncer.Syncer.track(..)))") // within(javaEcoreSync.Syncer) &&  
	private void trackScope() {}

	@After("cflowbelow(trackScope()) && target(org.eclipse.emf.ecore.EObject) && (execution(* *..set* (..)) || execution(* *..unset* (..)))") 
	public void featureSetCall(JoinPoint thisJoinPoint) {
		if (syncer != null) {
//			System.out.println("	in featureSetCall - is tracking updates? " + syncer.isTrackingUpdates());
			
			if (syncer.isTrackingUpdates()) {
				
//				System.out.println("	in getter " + thisJoinPoint.getSignature().getName());
				
				EObject eObj = (EObject) thisJoinPoint.getTarget();
				
				Object jObj = syncer.getEmfToJavaSyncer().getObject(eObj);
				if (jObj != null) { 
//					System.out.println("	in getter " + thisJoinPoint.getSignature().getName() + " of objec " + jObj.toString());
					String featureName = thisJoinPoint.getSignature().getName();
					featureName = decapitalize(getFeatureName(featureName));
					syncer.getEmfToJavaSyncer().addFeatureCall(eObj, featureName);
					
					// has opposite
					EStructuralFeature stFeature = eObj.eClass().getEStructuralFeature(featureName);
					if ((stFeature != null) && (stFeature instanceof EReference)) {
						EReference ref = (EReference) stFeature;
						EReference oppRef = ref.getEOpposite();
						if (oppRef != null) {
							if (!ref.isMany()) {
								EObject targetEObj = (EObject) eObj.eGet(ref);
								syncer.getEmfToJavaSyncer().addFeatureCall(targetEObj, oppRef.getName());
							}
						}
					}
				}
			}
		}
	}
	
	
	//target(java.util.Collection) && within(java.util.*) && !cflowbelow(initializationScope())
	@After("within(java.util.*) || cflowbelow(trackScope()) && target(java.util.Collection) "
			+ "&& ("
				+ "call(* java.util.Collection.add(..)) || "
				+ "call(* java.util.Collection.addAll(..)) ||"
				+ "call(* java.util.Collection.remove(..)) ||"
				+ "call(* java.util.Collection.removeAll(..)) ||"
				+ "call(* java.util.Collection.clear(..)) ||"
				+ "call(* java.util.Collection.retainAll(..))"
			+ ")") 
	public void collectionModification(JoinPoint thisJoinPoint) {
		if (colLevel==0) {
			colLevel++;
			
			if (syncer != null) {
				if (syncer.isTrackingUpdates()) {
//					System.out.println("COLLECTION operation detected: ");
					Collection<?> col = (Collection<?>) thisJoinPoint.getTarget();
					Pair<EObject,String> pair = syncer.getTrackedCollections().get(col);
//					System.out.println("COLLECTION: tracked collections: " + syncer.getTrackedCollections().toString());
					if (pair != null) {
//						System.out.println("COLLECTION: " + pair.getValue());
						EObject eObj = pair.getKey();
						String featureName = pair.getValue();
						syncer.getEmfToJavaSyncer().addFeatureCall(eObj, featureName);
						syncer.getTrackedCollections().remove(col);
						
						// track opposite refs
						EStructuralFeature ref = eObj.eClass().getEStructuralFeature(featureName);
						if (ref instanceof EReference) {
							EReference oppRef = (((EReference)ref).getEOpposite());
							if (oppRef != null) {
								for (EObject targetEObj: (Collection<EObject>) col) {
									syncer.getEmfToJavaSyncer().addFeatureCall(targetEObj, oppRef.getName());
								}
							}
						}
					}
				}
			}
			
			colLevel--;
		}
	}
	
	
	
	
	public static String getFeatureName(String featureName) {
		if (featureName.startsWith("set"))
			return featureName.substring(3, featureName.length());
		else // unset
			return featureName.substring(5, featureName.length());
	}
	public static String decapitalize(String string) {
	    if (string == null || string.length() == 0) {
	        return string;
	    }
	    char c[] = string.toCharArray();
	    c[0] = Character.toLowerCase(c[0]);
	    return new String(c);
	}
}
