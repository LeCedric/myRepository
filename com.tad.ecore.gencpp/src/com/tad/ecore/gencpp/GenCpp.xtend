package com.tad.ecore.gencpp

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcorePackage
import java.util.Collection
import java.util.HashSet

class GenCpp {

	def generate(EClass cls) '''
	
	«FOR p : cls.getPackages»
	import «p»;
	«ENDFOR»
		
	public class «cls.name» {
		«FOR att : cls.EAllAttributes»
		private «att.EType.instanceClass.simpleName» «att.name»;
		«ENDFOR»
	}
	''' 
	
	def Collection<String> getPackages(EClass cls) {
		var HashSet<String> set = new HashSet
		for (att : cls.EAllAttributes) {
			if (!att.EType.name.equals("EBoolean")) {
				set.add (att.EType.instanceClassName)
			} 
		}
		return set;
	}

	def static void main(String[] args) {
		val gen = new GenCpp
		println (gen.generate(EcorePackage.eINSTANCE.EClass))
	}
}