package org.xtext.lmjaq.generator;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class CSHARPGenerator {
  private static String eclispeProjectPath;
  
  public static ArrayList<GatilhoMethodData> gatilhoList;
  
  public static IFileSystemAccess2 fsa;
  
  protected static String ScriptPath = "Scripts/Game/";
  
  protected static String ComportamentoPath = (CSHARPGenerator.ScriptPath + "Comportamentos/");
  
  public static void generateCSHarpDataContainers(final IFileSystemAccess2 fsa) {
    final String path = "Scripts/JSONDataEsqueleton/";
    fsa.generateFile((path + "ModelData.cs"), CSHARPGenerator.generateModelData());
    fsa.generateFile((path + "ClassData.cs"), CSHARPGenerator.generateClassData());
    fsa.generateFile((path + "PropertyData.cs"), CSHARPGenerator.generatePropertyData());
    fsa.generateFile((path + "ReferenceData.cs"), CSHARPGenerator.generateReferenceData());
  }
  
  public static ArrayList<GatilhoMethodData> InitializeGatilhoList() {
    ArrayList<GatilhoMethodData> _arrayList = new ArrayList<GatilhoMethodData>();
    return CSHARPGenerator.gatilhoList = _arrayList;
  }
  
  public static String InitializeEclispeProjectPath(final String path) {
    return CSHARPGenerator.eclispeProjectPath = path;
  }
  
  public static IFileSystemAccess2 InitializeFileAcess(final IFileSystemAccess2 fsa2) {
    return CSHARPGenerator.fsa = fsa2;
  }
  
  protected static String generateModelData() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("using System.Collections;");
    _builder.newLine();
    _builder.append("using System.Collections.Generic;");
    _builder.newLine();
    _builder.append("using Newtonsoft.Json;");
    _builder.newLine();
    _builder.append("using UnityEngine;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ModelData");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"package\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<string> Packages {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"class\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ClassData Class {get; set;}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected static String generateClassData() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("using System.Collections;");
    _builder.newLine();
    _builder.append("using System.Collections.Generic;");
    _builder.newLine();
    _builder.append("using Newtonsoft.Json;");
    _builder.newLine();
    _builder.append("using UnityEngine;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("public class ClassData");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"type\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public string Type {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"name\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public string Name {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"properties\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public PropertyData Properties {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"references\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ReferenceData References {get; set;}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected static String generatePropertyData() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("using System.Collections;");
    _builder.newLine();
    _builder.append("using System.Collections.Generic;");
    _builder.newLine();
    _builder.append("using Newtonsoft.Json;");
    _builder.newLine();
    _builder.append("using UnityEngine;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("public class PropertyData");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"HashKeys\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<string> PropertiesKeys {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"HashValues\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<string> PropertiesValues {get; set;}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  protected static String generateReferenceData() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("using System.Collections;");
    _builder.newLine();
    _builder.append("using System.Collections.Generic;");
    _builder.newLine();
    _builder.append("using Newtonsoft.Json;");
    _builder.newLine();
    _builder.append("using UnityEngine;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("public class ReferenceData");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"Telas\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<string> TelaReferences {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"Objetos\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<string> ObjetoReferences {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"Recursos\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<string> RecursoReferences {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"Componentes\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<string> ComponenteReferences {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"Eventos\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<string> EventosReferences {get; set;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[JsonProperty(\"Alternativas\")]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<string> AlternativaReferences {get; set;}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String generateClassGatilho() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("using System.Collections;");
    _builder.newLine();
    _builder.append("using System.Collections.Generic;");
    _builder.newLine();
    _builder.append("using UnityEngine;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("public class Gatilho : MonoBehaviour");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public AoClicar AoClicarMethods {get; set;}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static void generateEventsClasses() {
    CSHARPGenerator.fsa.generateFile(((CSHARPGenerator.ComportamentoPath + "AoClicar") + ".cs"), CSHARPGenerator.generateClassAoClicar());
  }
  
  public static String generateClassAoClicar() {
    try {
      final String path = "temp/AoClicar";
      String _path = CSHARPGenerator.fsa.getURI(path).path();
      File directoryPath = new File(_path);
      String[] substrings = directoryPath.getPath().split("\\\\");
      String finalDirectoryPath = CSHARPGenerator.eclispeProjectPath;
      for (int i = 2; (i < substrings.length); i = (i + 1)) {
        String _get = substrings[i];
        String _plus = ((finalDirectoryPath + "\\") + _get);
        finalDirectoryPath = _plus;
      }
      CSHARPGenerator.fsa.generateFile("testeAOCLICAR.txt", finalDirectoryPath);
      File fObject = new File(finalDirectoryPath);
      InputOutput.<String>println(fObject.getAbsolutePath());
      CSHARPGenerator.fsa.generateFile("print.txt", finalDirectoryPath);
      File[] files = fObject.listFiles();
      int _length = files.length;
      String _plus = ("size: " + Integer.valueOf(_length));
      InputOutput.<String>println(_plus);
      CSHARPGenerator.InitializeGatilhoList();
      for (final File file : files) {
        {
          String filePath = file.getAbsolutePath();
          byte[] _readAllBytes = Files.readAllBytes(Paths.get(filePath));
          String content = new String(_readAllBytes, StandardCharsets.UTF_8);
          String[] gmdData = content.split("-");
          String _get = gmdData[0];
          String _get_1 = gmdData[1];
          String _get_2 = gmdData[2];
          GatilhoMethodData gmd = new GatilhoMethodData(_get, _get_1, _get_2);
          CSHARPGenerator.gatilhoList.add(gmd);
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("using System.Collections;");
      _builder.newLine();
      _builder.append("using System.Collections.Generic;");
      _builder.newLine();
      _builder.append("using UnityEngine;");
      _builder.newLine();
      _builder.append("using UnityEngine.SceneManagement;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("public class AoClicar : MonoBehaviour");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      {
        for(final GatilhoMethodData methodData : CSHARPGenerator.gatilhoList) {
          _builder.append("\t");
          _builder.append("public void ");
          _builder.append(methodData.gatilhoReferece, "\t");
          _builder.append("()");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("{");
          _builder.newLine();
          {
            boolean _equalsIgnoreCase = methodData.classType.equalsIgnoreCase("proximaTela");
            if (_equalsIgnoreCase) {
              {
                boolean _equalsIgnoreCase_1 = methodData.classReference.equalsIgnoreCase("EXIT");
                if (_equalsIgnoreCase_1) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("Application.Quit();");
                  _builder.newLine();
                } else {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("SceneManager.LoadScene(\"");
                  _builder.append(methodData.classReference, "\t\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                }
              }
            } else {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("// CODE FOR FOR COMPORTAMENTO(S)");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void Call(string methodReference)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("switch(methodReference)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      {
        for(final GatilhoMethodData methodData_1 : CSHARPGenerator.gatilhoList) {
          _builder.append("\t\t\t");
          _builder.append("case (\"");
          _builder.append(methodData_1.gatilhoReferece, "\t\t\t");
          _builder.append("\"):");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append(methodData_1.gatilhoReferece, "\t\t\t\t");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append("break;");
          _builder.newLine();
        }
      }
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      return _builder.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
