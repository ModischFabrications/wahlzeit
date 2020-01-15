package org.wahlzeit.model.printphoto.typeobjects;

import java.util.HashMap;

public class PrintManager {
    // eager init singleton
    private static PrintManager instance = new PrintManager();

    private HashMap<String, PrintType> types = new HashMap<>();

    public enum validType {
        SLA, FDM, SLS
    }

    public static PrintManager getInstance() {
        return instance;
    }

    private void assertIsValidPrintTypeName(String name) throws IllegalArgumentException {
        validType.valueOf(name);
    }

    public Print createPrint(String typeName) {
        assertIsValidPrintTypeName(typeName);

        PrintType type = types.getOrDefault(typeName, new PrintType(this));
        Print result = new Print(type, this);
        types.put(typeName, type);

        return result;
    }


}
