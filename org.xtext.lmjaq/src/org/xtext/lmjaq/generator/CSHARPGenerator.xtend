package org.xtext.lmjaq.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.ArrayList
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.charset.StandardCharsets
import java.nio.file.Paths

class CSHARPGenerator 
{
	
	var static String eclispeProjectPath
	
	public static ArrayList<GatilhoMethodData> gatilhoList;
	public static IFileSystemAccess2 fsa;
	protected static String ScriptPath = "Scripts/Game/" ;
	protected static String ComportamentoPath = ScriptPath + "Comportamentos/";
	
	def static generateCSHarpDataContainers(IFileSystemAccess2 fsa)
	{
		val path = "Scripts/JSONDataEsqueleton/"
		
		fsa.generateFile(path + "ModelData.cs", generateModelData())
		fsa.generateFile(path + "ClassData.cs", generateClassData())
		fsa.generateFile(path + "PropertyData.cs", generatePropertyData())
		fsa.generateFile(path + "ReferenceData.cs", generateReferenceData())
	}
	
	def static InitializeGatilhoList()
	{
		gatilhoList = new ArrayList
	}
	
	def static InitializeEclispeProjectPath(String path)
	{
		eclispeProjectPath = path
	}
	
	def static InitializeFileAcess(IFileSystemAccess2 fsa2)
	{
		fsa = fsa2
	}
	
	
	protected def static generateModelData()
	{
		return
		'''
		using System.Collections;
		using System.Collections.Generic;
		using Newtonsoft.Json;
		using UnityEngine;
		
		public class ModelData
		{
			[JsonProperty("package")]
			public List<string> Packages {get; set;}
			
			[JsonProperty("class")]
			public ClassData Class {get; set;}
		}
		'''
	}
	
	protected def static generateClassData()
	{
		return
		'''
		using System.Collections;
		using System.Collections.Generic;
		using Newtonsoft.Json;
		using UnityEngine;
				
		public class ClassData
		{
			[JsonProperty("type")]
			public string Type {get; set;}
			
			[JsonProperty("name")]
			public string Name {get; set;}
			
			[JsonProperty("properties")]
			public PropertyData Properties {get; set;}
			
			[JsonProperty("references")]
			public ReferenceData References {get; set;}
		}
		'''
	}
	
	protected def static generatePropertyData()
	{
		return
		'''
		using System.Collections;
		using System.Collections.Generic;
		using Newtonsoft.Json;
		using UnityEngine;
				
		public class PropertyData
		{
			[JsonProperty("HashKeys")]
			public List<string> PropertiesKeys {get; set;}
			
			[JsonProperty("HashValues")]
			public List<string> PropertiesValues {get; set;}
		}
		
		'''
	}
	
	protected def static generateReferenceData()
	{
	    // TO DO: Code Optmization
		
		return
		'''
		using System.Collections;
		using System.Collections.Generic;
		using Newtonsoft.Json;
		using UnityEngine;
						
		public class ReferenceData
		{
			[JsonProperty("Telas")]
			public List<string> TelaReferences {get; set;}
			
			[JsonProperty("Objetos")]
			public List<string> ObjetoReferences {get; set;}
			
			[JsonProperty("Recursos")]
			public List<string> RecursoReferences {get; set;}
			
			[JsonProperty("Componentes")]
			public List<string> ComponenteReferences {get; set;}
			
			[JsonProperty("Eventos")]
			public List<string> EventosReferences {get; set;}
			
			[JsonProperty("Alternativas")]
			public List<string> AlternativaReferences {get; set;}
		}
		'''
	}
	
	// 
	def static generateClassGatilho()
	{
		return
		'''
		using System.Collections;
		using System.Collections.Generic;
		using UnityEngine;
				
		public class Gatilho : MonoBehaviour
		{
			public AoClicar AoClicarMethods {get; set;}
		}
		'''
	}
	
	// NOMEREF
	// EVENTOREF
	
	def static generateEventsClasses()
	{
		fsa.generateFile(ComportamentoPath + "AoClicar" + ".cs", generateClassAoClicar());
	}
	
	def static generateClassAoClicar()
	{
		val path = "temp/AoClicar"
		
		// Relative
		var File directoryPath = new File(fsa.getURI(path).path)
		var String []substrings = directoryPath.path.split("\\\\")
		var String finalDirectoryPath = eclispeProjectPath
		
		// Getting all substrings for final apth
		for(var int i = 2; i < substrings.length; i = i + 1)
		{
			// fsa.generateFile("testeAOCLICAR.txt", substrings.get(i))
			finalDirectoryPath = finalDirectoryPath + "\\" + substrings.get(i)
		}
		
		fsa.generateFile("testeAOCLICAR.txt", finalDirectoryPath)
		
		var File fObject = new File(finalDirectoryPath)	
		println(fObject.absolutePath)
		fsa.generateFile("print.txt", finalDirectoryPath)
		
		var File []files = fObject.listFiles
		println("size: " + files.length)
		
		InitializeGatilhoList()
		
		// var Path currentRelativePath = Paths.get("");
		// var String s = currentRelativePath.toAbsolutePath().toString();
		// fsa.generateFile("testeAOCLICAR.txt", fsa.getURI(path).path)	
		
		//fsa.getURI(path).path
		
		// fsa.
		
		for(File file : files)
		{
			var String filePath = file.absolutePath;
		
			// Get cotnents of FILE
			// fsa.generateFile("testeAOCLICAR.txt", filePath)	
			var String content = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
			
			// Get GMD data
			var String []gmdData = content.split('-') 
			
			var GatilhoMethodData gmd = new GatilhoMethodData(gmdData.get(0) ,gmdData.get(1), gmdData.get(2))
			
			gatilhoList.add(gmd)
		}
			
		
		return
		'''
		using System.Collections;
		using System.Collections.Generic;
		using UnityEngine;
		using UnityEngine.SceneManagement;
				
		public class AoClicar : MonoBehaviour
		{
			«FOR methodData : gatilhoList»
			public void «methodData.gatilhoReferece»()
			{
				«IF methodData.classType.equalsIgnoreCase('proximaTela')»
					«IF methodData.classReference.equalsIgnoreCase("EXIT")»
						Application.Quit();
					«ELSE»
						SceneManager.LoadScene("«methodData.classReference»");
					«ENDIF»
				«ELSE»
					// CODE FOR FOR COMPORTAMENTO(S)
				«ENDIF»
			}
			«ENDFOR»
			
			public void Call(string methodReference)
			{
				switch(methodReference)
				{
					«FOR methodData : gatilhoList»
					case ("«methodData.gatilhoReferece»"):
						«methodData.gatilhoReferece»();
						break;
					«ENDFOR»
				}
			}
		}
		'''
	}
	
}