/*
 * generated by Xtext 2.9.2
 */
package com.tad.chart.xtext.generator

import com.tad.chart.xtext.chartDsl.Company
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ChartDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		val c = resource.contents.head as Company
		fsa.generateFile(c.name+".txt", c.generate)
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
	
	def generate(Company c) '''
	Inof de �c.name�
	'''
}
