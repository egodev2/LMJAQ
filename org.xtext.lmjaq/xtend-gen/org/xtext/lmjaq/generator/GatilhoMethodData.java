package org.xtext.lmjaq.generator;

import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class GatilhoMethodData {
  public String gatilhoReferece;
  
  public String classType;
  
  public String classReference;
  
  private final String path = "temp/AoClicar/";
  
  public GatilhoMethodData(final String gatilhoReference, final String classType, final String classReference) {
    this.gatilhoReferece = gatilhoReference;
    this.classType = classType;
    this.classReference = classReference;
  }
  
  public void WriteDataToFile(final String filename, final IFileSystemAccess2 fsa) {
    fsa.generateFile(((this.path + filename) + ".txt"), this.SaveInStringFormat());
  }
  
  public String SaveInStringFormat() {
    return ((((this.gatilhoReferece + "-") + this.classType) + "-") + this.classReference);
  }
}
