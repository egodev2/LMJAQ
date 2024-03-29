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
import org.junit.Assert
import org.eclipse.xtext.testing.validation.ValidationTestHelper

@ExtendWith(InjectionExtension)
@InjectWith(LMJAQInjectorProvider)
class LMJAQParsingTela {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Inject extension ValidationTestHelper 
	
	@Test
	def void loadModel() {
		
		// parse Retorna um modelo EMF: mesmo com erro de syntax;.
		// ValidationTestHelper -> assertNoErrors
		
		val result = parseHelper.parse(
		'''
			Tela minhaTela
			{
				Nome : tela
			}
		''')
		
		result.assertNoErrors
		
		Assertions.assertNotNull(result)
		
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		//Assert.assertEquals("MeuObjeto",result.classes.get(0).objects.get(0).name);
	}
	
	@Test
	def void meuTeste()
	{
		val result = parseHelper.parse(
		'''
			Tela minhaTela2
			{
				Nome : minhaTela
			}
		''')
		
		Assertions.assertNotNull(result)
		
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	@Test
	def void CrossRefTeste()
	{
		val result = parseHelper.parse(
		'''
			Tela tela2
			{
				Nome: tela2
				Objeto botao
				{
					X : 13.0
					Y : 14.0
					Nome : botaoiniciar
					estaAtivo : false
					OnClick : isso1
					
				}	
			}
		''')
		
		Assertions.assertNotNull(result)
		
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}
