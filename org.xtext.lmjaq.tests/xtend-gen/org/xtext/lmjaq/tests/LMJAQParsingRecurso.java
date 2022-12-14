/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lmjaq.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.lmjaq.lMJAQ.Model;

@ExtendWith(InjectionExtension.class)
@InjectWith(LMJAQInjectorProvider.class)
@SuppressWarnings("all")
public class LMJAQParsingRecurso {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void ParseTexto() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Texto minhaTela");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Conteudo : Meu texto HUEHUE");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(result);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ParseImagem() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Imagem minhaTela");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Caminho : aaa/bbb/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Tamanho : 300 200");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(result);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
