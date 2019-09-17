package util

import java.util.List

class Stats {
	
	def static long mean(long[] m) {
		// sort list in ascending order
		m.sum/m.size
	}
	
	def static double mean(double[] m) {
		// sort list in ascending order
		m.sum/m.size
	}
	
	
	def static long median(long[] m) {
		// sort list in ascending order
		m.sortInplace
		
	    val int middle = m.length/2;
	    if (m.length%2 == 1) {
	        return m.get(middle);
	    } else {
	        return (m.get(middle) + m.get(middle)) / 2;
	    }
	}
	def static double median(double[] m) {
		// sort list in ascending order
		m.sortInplace
		
	    val int middle = m.length/2;
	    if (m.length%2 == 1) {
	        return m.get(middle);
	    } else {
	        return (m.get(middle) + m.get(middle)) / 2;
	    }
	}

  	def static double toMillis(Long ns) {
  		(ns as double)/(1000000 as double)
  	}
  
  	def static double toMBs(Long bytes) {
  		(bytes as double)/(1024.0 * 1024.0)
  	}
  	def static double toGBs(Long bytes) {
  		(bytes as double)/(1024.0 * 1024.0 * 1024.0)
  	}
  
  	def static long sum(long[] list) {
		list.reduce[v1, v2 | v1+v2]
	}
  
  	def static double sum(double[] list) {
		list.reduce[v1, v2 | v1+v2]
	}
	
	
	
	
	
	
	
	
		
	
	
	
	def static peekMemoryUsage() {
		Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()
	}
	
	def static since(long time) {
		(System.nanoTime()-time) 
	}
	def static memorySince(long memory) {
		util.Stats.peekMemoryUsage() - memory 
	}
}