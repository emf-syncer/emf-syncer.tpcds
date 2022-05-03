package tpcds

import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import tpcds.domain.lazy.StoreReturns
import tpcds.gen.q1.Customer
import tpcds.gen.q1.DateDim
import tpcds.gen.q1.Q1Factory
import tpcds.gen.q1.Store

class ReferenceTrafo {
	val  Q1Factory FACTORY = Q1Factory.eINSTANCE 
	
	@Accessors		
	var  int featureCount = 0
	@Accessors		
	var  int objectCount = 0
	@Accessors		
	 Map<String,EObject> idToEObject = newHashMap
		
	
	def  trafo(List<StoreReturns> sourceList) {
		val targetList = newArrayList
		
		for (sr: sourceList) {
			val targetSr = FACTORY.createStoreReturns
			
			objectCount++
			targetList.add(targetSr)
			
			var DateDim targetDate
			if (sr.srReturnedDateSk !== null) {
				targetDate = idToEObject.get('date_' + sr.srReturnedDateSk.DDateSk) as DateDim 
				if (targetDate === null) {
					targetDate = FACTORY.createDateDim
					idToEObject.put('date_' + sr.srReturnedDateSk.DDateSk, targetDate)
					objectCount++
					targetDate.DDateId = sr.srReturnedDateSk.DDateId ; featureCount++ 
					targetDate.DDateSk = sr.srReturnedDateSk.DDateSk ; featureCount++ 
					if (sr.srReturnedDateSk.DYear !== null) { 
						targetDate.DYear = sr.srReturnedDateSk.DYear ; featureCount++
					} 
				}
				targetSr.srReturnedDateSk = targetDate	
			}
			
			val targetSrId = FACTORY.createStoreReturnsId
			objectCount++
			if (sr.srId?.srItemSk!==null) {targetSrId.srItemSk = sr.srId.srItemSk ; featureCount++ }
			if (sr.srId?.srTicketNumber!==null) {targetSrId.srTicketNumber = sr.srId.srTicketNumber ; featureCount++ }
			targetSr.setSrId = targetSrId
			
			var Customer targetCustomer
			if (sr.srCustomerSk !== null) {
				targetCustomer = idToEObject.get('customer_' + sr.srCustomerSk.CCustomerSk) as Customer 
				if (targetCustomer === null) {
					targetCustomer = FACTORY.createCustomer
					idToEObject.put('customer_' + sr.srCustomerSk.CCustomerSk, targetCustomer)
					objectCount++
					targetCustomer.CCustomerId = sr.srCustomerSk.CCustomerId ; featureCount++ 
					targetCustomer.CCustomerSk = sr.srCustomerSk.CCustomerSk ; featureCount++ 
				}
				targetCustomer.storeReturns.add(targetSr) 
			}
			
			if (sr.srReturnAmt!==null) {
				targetSr.srReturnAmt = sr.srReturnAmt ; featureCount++
			} 
			
			var Store targetStore
			if (sr.srStoreSk !== null) {
				targetStore = idToEObject.get('store_' + sr.srStoreSk.SStoreSk) as Store 
				if (targetStore === null) {
					targetStore = FACTORY.createStore
					idToEObject.put('store_' + sr.srStoreSk.SStoreSk, targetStore)
					objectCount++
					if (sr.srStoreSk.SState!==null) { targetStore.setSState = sr.srStoreSk.SState ; featureCount++ }
					targetStore.setSStoreId = sr.srStoreSk.SStoreId ; featureCount++ 
					targetStore.setSStoreSk = sr.srStoreSk.SStoreSk ; featureCount++
				}
				targetSr.srStoreSk = targetStore ; featureCount++ 
			} 
		}
		targetList
	}
}