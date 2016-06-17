/**
 * generated by Xtext 2.9.1
 */
package de.luh.se.mbse.network.textualeditor.generator;

import com.google.common.collect.Iterables;
import de.luh.se.mbse.network.textualeditor.amf.Network;
import de.luh.se.mbse.network.textualeditor.amf.Statemachine;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AmfGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Network> _filter = Iterables.<Network>filter(_iterable, Network.class);
    for (final Network network : _filter) {
      String _name = network.getName();
      String _plus = ("network/" + _name);
      String _plus_1 = (_plus + ".java");
      CharSequence _compile = this.compile(network);
      fsa.generateFile(_plus_1, _compile);
    }
  }
  
  public CharSequence compile(final Network network) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    EObject _eContainer = network.eContainer();
    Resource _eResource = _eContainer.eResource();
    URI _uRI = _eResource.getURI();
    _builder.append(_uRI, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("public class ");
    String _name = network.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Statemachine");
    _builder.newLine();
    {
      EList<Statemachine> _statemachine = network.getStatemachine();
      for(final Statemachine s : _statemachine) {
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}