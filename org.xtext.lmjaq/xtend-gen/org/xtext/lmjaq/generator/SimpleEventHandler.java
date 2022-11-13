package org.xtext.lmjaq.generator;

import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class SimpleEventHandler {
  public static HashMap<String, String> seMap;
  
  private static String eventTypeTmp;
  
  private static String referenceNameTmp;
  
  public static HashMap<String, String> InitializeHandler() {
    return SimpleEventHandler.seMap = CollectionLiterals.<String, String>newHashMap();
  }
  
  public static String RegisterSimpleEvent(final String eventType, final String referenceName) {
    return SimpleEventHandler.seMap.put(referenceName, eventType);
  }
  
  public static String RegisterSimpleEventType(final String eventType) {
    return SimpleEventHandler.eventTypeTmp = eventType;
  }
  
  public static Object Analyze(final String typeName) {
    Object _xblockexpression = null;
    {
      String[] arguments = typeName.split("->");
      for (final String arg : arguments) {
        arg.replaceAll(" ", "");
      }
      final String firstType = arguments[0];
      final String secondType = arguments[1];
      Object _xifexpression = null;
      boolean _isSimpleEvent = SimpleEventHandler.isSimpleEvent(secondType);
      if (_isSimpleEvent) {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static boolean isSimpleEvent(final String typeName) {
    boolean _equalsIgnoreCase = typeName.equalsIgnoreCase("proximaTela");
    if (_equalsIgnoreCase) {
      return true;
    }
    return false;
  }
}
