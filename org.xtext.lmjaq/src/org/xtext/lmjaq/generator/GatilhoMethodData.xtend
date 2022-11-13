package org.xtext.lmjaq.generator

import org.eclipse.xtext.generator.IFileSystemAccess2

class GatilhoMethodData 
{
	public String gatilhoReferece;
	public String classType;
	public String classReference;
	
	val path = "temp/AoClicar/"
	
	new(String gatilhoReference, String classType, String classReference)
	{
		this.gatilhoReferece = gatilhoReference;
		this.classType = classType
		this.classReference = classReference 
	}
	
	def void WriteDataToFile(String filename, IFileSystemAccess2 fsa)
	{
		fsa.generateFile(path + filename + ".txt", SaveInStringFormat())
	}
	
	def SaveInStringFormat()
	{
		return gatilhoReferece + "-" + classType + "-" + classReference
	}
	
}