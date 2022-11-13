package org.xtext.lmjaq.generator

import java.util.HashMap
import java.util.ArrayList
import org.xtext.lmjaq.lMJAQ.AbstractClass
import org.xtext.lmjaq.lMJAQ.AbstractProperty
import org.xtext.lmjaq.lMJAQ.LMJAQPackage
import org.xtext.lmjaq.lMJAQ.ClassReference
import org.eclipse.xtext.generator.IFileSystemAccess2

class AbstractPropertySorter
{	
	public HashMap <String, ArrayList<String>> crMap
	public ArrayList<AbstractProperty> properties
	public HashMap <String, ArrayList<String>> groupedTypes
	public IFileSystemAccess2 fsa
	
	// Constructor
	new (AbstractClass ac, IFileSystemAccess2 fsa)
	{
		crMap = ac.MapAllClassReferences()
		properties = ac.MapAllProperties()
		groupedTypes = crMap.InitializeKeyGroupeReferenceTable()
		this.fsa = fsa
	}
	
	
	def ArrayList<AbstractProperty> getProperties()
	{
		return properties
	}
	
	def HashMap <String, ArrayList<String>> getClassReferenceMap()
	{
		return crMap
	}
	
	def protected MapAllProperties(AbstractClass ac)
	{
		var ArrayList<AbstractProperty> pListCandidate = new ArrayList<AbstractProperty>
		
		for(ap : ac.abstractProperties)
		{
			if(ap.format.eClass.name.equalsIgnoreCase(LMJAQPackage.Literals.PROPERTY.name))
			{
				pListCandidate.add(ap)	
			}
		}
		
		return pListCandidate
	}
	
	def protected MapAllClassReferences(AbstractClass ac)
	{	
		var crListCandidate = new ArrayList<AbstractProperty>
		
		for(ap : ac.abstractProperties)
		{
			if(ap.format.eClass.name.equalsIgnoreCase(LMJAQPackage.Literals.CLASS_REFERENCE.name))
			{			
				// WHEN 
				crListCandidate.add(ap)	
			}
		}
		
		var HashMap <String, ArrayList<String>> classReferenceByTypeMap = newHashMap()
		
		for(ap : crListCandidate)
		{			
			var String apClassReferenceType = ap.getClassReferenceString()
			
			// Filtro
			apClassReferenceType = simplifyKey(apClassReferenceType)	
			
			if(!classReferenceByTypeMap.containsKey(apClassReferenceType))
			{
				var newList = new ArrayList	
				newList.add(ap.values.get(0))
				classReferenceByTypeMap.put(apClassReferenceType, newList)
			}
			else 
			{
				var oldList = classReferenceByTypeMap.get(apClassReferenceType)
				var newList = new ArrayList(oldList)
				newList.add(ap.values.get(0))
				classReferenceByTypeMap.replace(apClassReferenceType, newList)
			}
		}
		
		return classReferenceByTypeMap
	}
	
	def protected InitializeKeyGroupeReferenceTable(HashMap <String, ArrayList<String>> crMap)
	{
		var HashMap <String, ArrayList<String>> keyGroupReferenceTable = newHashMap()
		
		for(typeKey : crMap.keySet)
		{
			// Get Group Reference
			var groupReferenceKey = getKeyGroupReference(typeKey)
			
			// First Time inserting group Reference (Key)
			if(keyGroupReferenceTable.containsKey(groupReferenceKey) == false)
			{
				var newList = new ArrayList	
				newList.add(typeKey)
				keyGroupReferenceTable.put(groupReferenceKey, newList)
			}
			// There is already one type (value) in grouped 
			else if(checkForTypeInKey(keyGroupReferenceTable, groupReferenceKey, typeKey) == false)
			{
				var oldList = keyGroupReferenceTable.get(groupReferenceKey)
				var newList = new ArrayList(oldList)
				newList.add(typeKey)
				keyGroupReferenceTable.replace(groupReferenceKey, newList)
			}
		}
		
		return keyGroupReferenceTable
	}
	
	def protected getKeyGroupReference(String typeKey)
	{		
		var typeGroup = ""
		
		if(typeKey.equalsIgnoreCase("Objeto"))
		{
		    typeGroup = "Objetos"	
		}
		else if(typeKey.equalsIgnoreCase("Texto") || typeKey.equalsIgnoreCase("Imagem"))
		{
			typeGroup = "Recursos"
		}
		else if(typeKey.equalsIgnoreCase("AoClicar"))
		{
			typeGroup = "Componentes"	
		}
		else if(typeKey.equalsIgnoreCase('Evento'))
		{
		
		}
		else if(typeKey.equalsIgnoreCase('Estado'))
		{
			typeGroup = "Estados" 
		}
		else if(typeKey.equalsIgnoreCase('Alternativa'))
		{
			typeGroup = "Alternativas"
		}
		// EVENTO SIMPLES >>> PROPRIEDADE
		// AoClicar BotaoInciardeTelaInicial {
		// proximaTela : telaQ1
		// }
		// EVENT OCOMPLEXO >> CLASSE
		
		return typeGroup
	}
	
	def isSimpleEvent(String typeName)
	{
		if(typeName.equalsIgnoreCase("proximaTela"))
		{
			return true
		}
		return false
	}
	
	def isPartOfComportamentoORGatilho(String typeName)
	{
		if(typeName.equalsIgnoreCase("AoClicar"))
		{
			return true
		}
		return false
	}
	
	def protected checkForTypeInKey(HashMap <String, ArrayList<String>> keyGroupReferenceTable, String groupReferenceKey, String typeKey)
	{
		val list = keyGroupReferenceTable.get(groupReferenceKey)
		
		for(type : list)
		{
			if(type.equalsIgnoreCase(typeKey))
			{
				return true
			}
		}
		
		return false
	}
	
	
	/// Assisting
	
	def protected simplifyKey(String s)
	{
		var newString = s.replace(' ','')
		newString.replaceFirst("[->]","-") 
		return newString
	}
	
	def protected getClassReferenceString(AbstractProperty ap)
	{
		return ap.eContents.filter(ClassReference).get(0).type.type
	}	
	
}