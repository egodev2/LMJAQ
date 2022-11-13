package org.xtext.lmjaq.generator

import java.util.ArrayList
import java.util.HashMap

class SimpleEventHandler {
	
	public static HashMap <String, String> seMap
	static String eventTypeTmp
	static String referenceNameTmp

	def static InitializeHandler()
	{
			seMap = newHashMap()
	}
	
	def static RegisterSimpleEvent(String eventType, String referenceName)
	{
		seMap.put(referenceName, eventType)
	}
	
	def static RegisterSimpleEventType(String eventType)
	{
		eventTypeTmp = eventType
	}

	def static Analyze(String typeName)
	{
		var String[] arguments = typeName.split("->")
			
		for(String arg : arguments)
		{
			arg.replaceAll(" ","")
		}
			
		val firstType = arguments.get(0)
		val secondType = arguments.get(1)
		
		// Second Argument Check
		if(secondType.isSimpleEvent())
		{
			// call FSA to write a simple class with
			// name (referência) / eventType (proximaTela)
		}
	}
	
	def static isSimpleEvent(String typeName)
	{
		if(typeName.equalsIgnoreCase("proximaTela"))
		{
			return true
		}
		return false
	}
	
}