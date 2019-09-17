package emf_syncer

import java.lang.reflect.Field
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.FeatureMap
import tpcds.tpcdsModel.TpcdsModelPackage

/**
 * Mapping at model level
 */
class JavaRetyper {

	def static List<EObject> processObjects(List<Object> objectList) {
        objectList.map[createEObject(it)]
	}

//	def static processObject(Object obj) {
//		try {
//		    val cls = obj.class
//		
//		    val fieldlist = cls.getDeclaredFields()
//		    for (var int i = 0; i < fieldlist.length; i++) {
//		       val Field fld = fieldlist.get(i)
//		       System.out.println("name = " + fld.getName())
//		       System.out.println("decl class = " + fld.getDeclaringClass());
//		       System.out.println("type = " + fld.getType());
//		       val int mod = fld.getModifiers();
//		       System.out.println("modifiers = " + Modifier.toString(mod));
//		       System.out.println("value = " + obj.getFieldValue(fld))
//		       System.out.println("-----");
//		       
//		    }
//		}
//		catch (Throwable e) {
//		   System.err.println(e);
//		}
//	
//	}
	
	def static createEObject(Object obj) {
		
		// create object
		val objEClass = TpcdsModelPackage.eINSTANCE.EClassifiers.findFirst[
			name == obj.class.simpleName
		] as EClass
		val eObj = EcoreUtil.create(objEClass)
		
		// initialize object
		try {
		    val cls = obj.class
		    val fieldlist = cls.getDeclaredFields()
		    for (var int i = 0; i < fieldlist.length; i++) {
		       val Field fld = fieldlist.get(i)
//		       val value = obj.getFieldValue(fld)
				val value = obj.fieldValueToFeatureValue(fld, objEClass)
		       if (value !== null) {
		       		val f = objEClass.EAllStructuralFeatures.findFirst[
		       			name == fld.name
		       		]
		       		eObj.eSet(f, value)
		       }
		    }
		}
		catch (Throwable e) {
		   System.err.println(e);
		}
		
//		println(eObj)
		return eObj
	}
	
	// at the moment only single-valued attributes
	def static fieldValueToFeatureValue(Object obj, Field field, EClass eClass) {
		val stFeature = eClass.getStFeature(field)
		
		switch (stFeature.EType) {
			EEnum: { // TODO: enum attribute
				// println('''translate EEnum «stFeature.EType.name»''')
			}
			
			EDataType: { // attribute
				if (Modifier.isPublic(field.modifiers)) {
			
					val type = field.type
					switch (type) { 
						// TODO: complete list of basic data types
						case Integer.TYPE:
							return field.getInt(obj)
						case Double.TYPE: 
							return field.getDouble(obj)
						case Float.TYPE: 
							return field.getFloat(obj)
						case Boolean.TYPE: 
							return field.getBoolean(obj)
						case Long.TYPE: 
							return field.getLong(obj)
						case Short.TYPE: 
							return field.getShort(obj)
						case Byte.TYPE: 
							return field.getByte(obj)
							
						default: // any other object, including (String, Long, Integer, ...)
							return field.get(obj)
					} 
					
					// TODO consider datatype collections!
				
				} else {
					val methodList = obj.class.declaredMethods as List<Method>
					val method = methodList.findFirst[
						name.equalsIgnoreCase('''get«field.name»''')
					]
					return method.invoke(obj,null)
				}
			}
			
			EClass: { // reference
				// println('''translate EClass «stFeature.EType.name»''')
				
				// TODO
				// Set
				// EMap
				// EList
			}
			FeatureMap: println('''translate FeatureMap «stFeature.EType.name»''')

			default: println('''translate type «stFeature.EType.name»''')

		}
		
		return null
	}
	
	
		
	def static getStFeature(EClass eClass, Field field) {
		val stFeature = eClass.EAllStructuralFeatures.findFirst[name == field.name]
		if (stFeature === null)
			throw new Exception('''
			JavaEmfSynchronizer error:
				The Java field «field.name» does not correspond to an EStructuralFeature in the EClass «eClass.name».
			''')
		stFeature
	}
	
//	def static getFieldValue(Object obj, Field fld) {
//		if (Modifier.isPublic(fld.modifiers)) {
//			
//			val type = fld.type
//			switch (type) { 
//				// TODO: complete list of basic data types
//				case Integer.TYPE:
//					return fld.getInt(obj)
//				case Double.TYPE: 
//					return fld.getDouble(obj)
//				case Float.TYPE: 
//					return fld.getFloat(obj)
//				case Boolean.TYPE: 
//					return fld.getBoolean(obj)
//				case Long.TYPE: 
//					return fld.getLong(obj)
//				case Short.TYPE: 
//					return fld.getShort(obj)
//				case Byte.TYPE: 
//					return fld.getByte(obj)
//					
//				default: // any other object, including (String, Long, Integer, ...)
//					return fld.get(obj)
//			} 
//		
//		} else {
//			val methodList = obj.class.declaredMethods as List<Method>
//			val method = methodList.findFirst[
//				name.equalsIgnoreCase('''get«fld.name»''')
//			]
//			return method.invoke(obj,null)
//		}
//	}
}

