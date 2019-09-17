package util

import org.eclipse.xtend.lib.annotations.Accessors

class QueryStats {
	@Accessors
	String query = ''
	
	@Accessors
	String factor = ''
	
	@Accessors
	long size_model = 0
	
	@Accessors
	int iteration = 0
		
	
	@Accessors
	double time_fetching = 0
	@Accessors
	double memory_fetching = 0
	
	@Accessors
	double time_sqlQuery = 0
	@Accessors
	double memory_sqlQuery = 0

	@Accessors
	double time_java1st = 0
	@Accessors
	double memory_java1st = 0
	@Accessors
	boolean correct_java1st = false

	@Accessors
	double time_java2nd = 0
	@Accessors
	double memory_java2nd = 0
	@Accessors
	boolean correct_java2nd = false
	
	@Accessors
	String syncer_type = "LAZY"
	@Accessors
	double time_syncer = 0
	@Accessors
	double memory_syncer = 0
	@Accessors
	double size_syncer = 0 // #objects


	@Accessors
	double time_emf1st = 0
	@Accessors
	double memory_emf1st = 0
	@Accessors
	boolean correct_emf1st = false

	
	@Accessors
	double time_emf2nd = 0
	@Accessors
	double memory_emf2nd = 0
	@Accessors
	boolean correct_emf2nd = false

	@Accessors
	double time_update = 0
	@Accessors
	double memory_update = 0

	@Accessors
	double time_update2 = 0
	@Accessors
	double memory_update2 = 0

	@Accessors
	double time_backPropagation = 0
	@Accessors
	double memory_backPropagation = 0
	@Accessors
	boolean correct_backPropagation = false
	@Accessors
	long size_backPropagation = 0

	@Accessors
	double time_referenceMapper = 0
	@Accessors
	double memory_referenceMapper = 0
	@Accessors
	long size_mapper = 0
	
	@Accessors
	boolean correct_referenceMapper = false
	

}