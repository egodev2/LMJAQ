/*
 * generated by Xtext 2.25.0
 */
package org.xtext.lmjaq.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.lmjaq.lMJAQ.Model

@ExtendWith(InjectionExtension)
@InjectWith(LMJAQInjectorProvider)
class LMJAQParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void TesteDaClasseTela()
	{
		val result = parseHelper.parse(
		'''
			package objetos.objeto1
			
			Tela minhaTela
			{
				Objeto : objeto1
			}
			
		''')
		
		// Assertions.assertNotNull(result)
		
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	@Test
	def void TesteDePropriedade()
	{
		val result = parseHelper.parse(
		'''
			Objeto objeto
			{
				Posicao : 100.0 120.1
				estaAtivo : true
			}
			
		''')
		
		// Assertions.assertNotNull(result)
		
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}