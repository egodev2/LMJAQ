package org.xtext.lmjaq.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.lmjaq.lMJAQ.AbstractClass;
import org.xtext.lmjaq.lMJAQ.AbstractProperty;
import org.xtext.lmjaq.lMJAQ.ClassReference;
import org.xtext.lmjaq.lMJAQ.LMJAQPackage;

@SuppressWarnings("all")
public class AbstractPropertySorter {
  public HashMap<String, ArrayList<String>> crMap;
  
  public ArrayList<AbstractProperty> properties;
  
  public HashMap<String, ArrayList<String>> groupedTypes;
  
  public IFileSystemAccess2 fsa;
  
  public AbstractPropertySorter(final AbstractClass ac, final IFileSystemAccess2 fsa) {
    this.crMap = this.MapAllClassReferences(ac);
    this.properties = this.MapAllProperties(ac);
    this.groupedTypes = this.InitializeKeyGroupeReferenceTable(this.crMap);
    this.fsa = fsa;
  }
  
  public ArrayList<AbstractProperty> getProperties() {
    return this.properties;
  }
  
  public HashMap<String, ArrayList<String>> getClassReferenceMap() {
    return this.crMap;
  }
  
  protected ArrayList<AbstractProperty> MapAllProperties(final AbstractClass ac) {
    ArrayList<AbstractProperty> pListCandidate = new ArrayList<AbstractProperty>();
    EList<AbstractProperty> _abstractProperties = ac.getAbstractProperties();
    for (final AbstractProperty ap : _abstractProperties) {
      boolean _equalsIgnoreCase = ap.getFormat().eClass().getName().equalsIgnoreCase(LMJAQPackage.Literals.PROPERTY.getName());
      if (_equalsIgnoreCase) {
        pListCandidate.add(ap);
      }
    }
    return pListCandidate;
  }
  
  protected HashMap<String, ArrayList<String>> MapAllClassReferences(final AbstractClass ac) {
    ArrayList<AbstractProperty> crListCandidate = new ArrayList<AbstractProperty>();
    EList<AbstractProperty> _abstractProperties = ac.getAbstractProperties();
    for (final AbstractProperty ap : _abstractProperties) {
      boolean _equalsIgnoreCase = ap.getFormat().eClass().getName().equalsIgnoreCase(LMJAQPackage.Literals.CLASS_REFERENCE.getName());
      if (_equalsIgnoreCase) {
        crListCandidate.add(ap);
      }
    }
    HashMap<String, ArrayList<String>> classReferenceByTypeMap = CollectionLiterals.<String, ArrayList<String>>newHashMap();
    for (final AbstractProperty ap_1 : crListCandidate) {
      {
        String apClassReferenceType = this.getClassReferenceString(ap_1);
        apClassReferenceType = this.simplifyKey(apClassReferenceType);
        boolean _containsKey = classReferenceByTypeMap.containsKey(apClassReferenceType);
        boolean _not = (!_containsKey);
        if (_not) {
          ArrayList<String> newList = new ArrayList<String>();
          newList.add(ap_1.getValues().get(0));
          classReferenceByTypeMap.put(apClassReferenceType, newList);
        } else {
          ArrayList<String> oldList = classReferenceByTypeMap.get(apClassReferenceType);
          ArrayList<String> newList_1 = new ArrayList<String>(oldList);
          newList_1.add(ap_1.getValues().get(0));
          classReferenceByTypeMap.replace(apClassReferenceType, newList_1);
        }
      }
    }
    return classReferenceByTypeMap;
  }
  
  protected HashMap<String, ArrayList<String>> InitializeKeyGroupeReferenceTable(final HashMap<String, ArrayList<String>> crMap) {
    HashMap<String, ArrayList<String>> keyGroupReferenceTable = CollectionLiterals.<String, ArrayList<String>>newHashMap();
    Set<String> _keySet = crMap.keySet();
    for (final String typeKey : _keySet) {
      {
        String groupReferenceKey = this.getKeyGroupReference(typeKey);
        boolean _containsKey = keyGroupReferenceTable.containsKey(groupReferenceKey);
        boolean _equals = (_containsKey == false);
        if (_equals) {
          ArrayList<String> newList = new ArrayList<String>();
          newList.add(typeKey);
          keyGroupReferenceTable.put(groupReferenceKey, newList);
        } else {
          boolean _checkForTypeInKey = this.checkForTypeInKey(keyGroupReferenceTable, groupReferenceKey, typeKey);
          boolean _equals_1 = (_checkForTypeInKey == false);
          if (_equals_1) {
            ArrayList<String> oldList = keyGroupReferenceTable.get(groupReferenceKey);
            ArrayList<String> newList_1 = new ArrayList<String>(oldList);
            newList_1.add(typeKey);
            keyGroupReferenceTable.replace(groupReferenceKey, newList_1);
          }
        }
      }
    }
    return keyGroupReferenceTable;
  }
  
  protected String getKeyGroupReference(final String typeKey) {
    String typeGroup = "";
    boolean _equalsIgnoreCase = typeKey.equalsIgnoreCase("Objeto");
    if (_equalsIgnoreCase) {
      typeGroup = "Objetos";
    } else {
      if ((typeKey.equalsIgnoreCase("Texto") || typeKey.equalsIgnoreCase("Imagem"))) {
        typeGroup = "Recursos";
      } else {
        boolean _equalsIgnoreCase_1 = typeKey.equalsIgnoreCase("AoClicar");
        if (_equalsIgnoreCase_1) {
          typeGroup = "Componentes";
        } else {
          boolean _equalsIgnoreCase_2 = typeKey.equalsIgnoreCase("Evento");
          if (_equalsIgnoreCase_2) {
          } else {
            boolean _equalsIgnoreCase_3 = typeKey.equalsIgnoreCase("Estado");
            if (_equalsIgnoreCase_3) {
              typeGroup = "Estados";
            } else {
              boolean _equalsIgnoreCase_4 = typeKey.equalsIgnoreCase("Alternativa");
              if (_equalsIgnoreCase_4) {
                typeGroup = "Alternativas";
              }
            }
          }
        }
      }
    }
    return typeGroup;
  }
  
  public boolean isSimpleEvent(final String typeName) {
    boolean _equalsIgnoreCase = typeName.equalsIgnoreCase("proximaTela");
    if (_equalsIgnoreCase) {
      return true;
    }
    return false;
  }
  
  public boolean isPartOfComportamentoORGatilho(final String typeName) {
    boolean _equalsIgnoreCase = typeName.equalsIgnoreCase("AoClicar");
    if (_equalsIgnoreCase) {
      return true;
    }
    return false;
  }
  
  protected boolean checkForTypeInKey(final HashMap<String, ArrayList<String>> keyGroupReferenceTable, final String groupReferenceKey, final String typeKey) {
    final ArrayList<String> list = keyGroupReferenceTable.get(groupReferenceKey);
    for (final String type : list) {
      boolean _equalsIgnoreCase = type.equalsIgnoreCase(typeKey);
      if (_equalsIgnoreCase) {
        return true;
      }
    }
    return false;
  }
  
  protected String simplifyKey(final String s) {
    String newString = s.replace(" ", "");
    newString.replaceFirst("[->]", "-");
    return newString;
  }
  
  protected String getClassReferenceString(final AbstractProperty ap) {
    return (((ClassReference[])Conversions.unwrapArray((Iterables.<ClassReference>filter(ap.eContents(), ClassReference.class)), ClassReference.class))[0]).getType().getType();
  }
}
