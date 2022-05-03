package emf_syncer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class GetterAspect {
	static EMFSyncer syncer = null;
	
	// TO BE UPDATED: where model classes are
	@Pointcut("(within(tpcds.tpcdsModel.impl.*) || within(tpcds.gen.q1.impl.*))") // !within(org.eclipse.emf.*) && 
	// END TO BE UPDATED 

	// //////////////////////////////////////////////////////////////
	// DO NOT MODIFY BELOW
	// //////////////////////////////////////////////////////////////
	private void targetSyntacticScope() {}

	@Pointcut("within(emf_syncer.EMFSyncer) && (execution(* forwardSync(..)))")
	private void initializationScope() {}

	@Before("within(emf_syncer.EMFSyncer) && (call(* setEMFSyncerInAspect()))")
	public void getSyncer(JoinPoint thisJoinPoint) {
		syncer = (EMFSyncer) thisJoinPoint.getThis(); 
	}
	
	
	@Around(
		"targetSyntacticScope() && target(org.eclipse.emf.ecore.EObject) && execution(* *..get* (..))"
	) 
	public Object featureGetCall(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		Object currentValue = thisJoinPoint.proceed();
		Object newResult = currentValue;
		if (syncer != null) {
			newResult = syncer.featureGetCall(thisJoinPoint, currentValue);
		}
		return newResult;
	}
	
	
	@Pointcut("(execution(* emf_syncer.EMFSyncer.track(..)))")   
	private void trackScope() {}

	@After("cflowbelow(trackScope()) && target(org.eclipse.emf.ecore.EObject) && (execution(* *..set* (..)) || execution(* *..unset* (..)))") 
	public void featureSetCall(JoinPoint thisJoinPoint) {
		// System.out.println("DEBUG in aspect: " + thisJoinPoint);
		if (syncer != null) {
			syncer.featureSetCall(thisJoinPoint);
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
		if (syncer != null)
			syncer.collectionModification(thisJoinPoint);
	}
	
}
