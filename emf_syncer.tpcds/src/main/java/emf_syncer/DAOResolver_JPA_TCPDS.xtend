package emf_syncer

import org.hibernate.Hibernate
import org.hibernate.proxy.HibernateProxy
import tpcds.domain.lazy.Customer
import tpcds.domain.lazy.DateDim
import tpcds.domain.lazy.Store
import tpcds.domain.lazy.StoreReturns
import tpcds.domain.lazy.StoreReturnsId
import tpcds.domain.lazy.StoreSales
import tpcds.domain.lazy.StoreSalesId

class DAOResolver_JPA_TCPDS extends DAOResolver {
	
	// specific to JPA: this cache MUST NOT be reset
	// JPA loading is independent from our mechanism
	// but is needed to perform scalability experiments
	override getDbObject(Object dbObj) {
		var obj = dbObj
		// JPA LAZY: problem returns a new object each time!
		// cannot be used for caching unless we use identifiers instead of object hashcodes
		// This solution is domain specific!
		if (obj instanceof HibernateProxy) {
			obj = Hibernate.unproxy(obj)
		}
		
		var String id = ''
		switch (obj) {
			Customer: id="c_" + obj.CCustomerId
			DateDim: id="d_" + obj.DDateId
			Store: id="s_" + obj.SStoreId
			StoreReturnsId: id= '''sr_id_«obj.srItemSk»+«obj.srTicketNumber»'''
			StoreReturns: id= '''sr_«obj.srId?.srItemSk?:0»+«obj.srId?.srTicketNumber?:0»'''
			StoreSalesId: id= '''ss_id_«obj.ssCustomerSk.CCustomerId»+«obj.ssTicketNumber»'''
			StoreSales: id= '''ss_«obj.ssId.ssCustomerSk.CCustomerId»+«obj.ssId.ssTicketNumber»'''
		}
		
		var jObj = cachedLazyObjectMap.get(id)
		if (jObj===null) {
			cachedLazyObjectMap.put(id, obj);
			jObj = obj
		}
		return jObj
	}
}