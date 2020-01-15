package org.wahlzeit.model.printphoto.typeobjects;

import org.junit.Test;

public class PrintTypeTest {
    PrintManager manager = PrintManager.getInstance();

    @Test
    public void createInstance() {
        PrintType type = new PrintType(manager);
    }

    @Test
    public void isSubtypeOf() {
        PrintType supertype = new PrintType(manager);
        PrintType subtype = new PrintType(manager, supertype);

        assert subtype.isSubtypeOf(supertype);
    }

    @Test
    public void nestedIsSubtypeOf() {
        PrintType supertype = new PrintType(manager);
        PrintType subtype = new PrintType(manager, supertype);
        PrintType subsubtype = new PrintType(manager, subtype);

        assert subsubtype.isSubtypeOf(supertype);
    }

    @Test
    public void notIsSubtypeOf() {
        PrintType type1 = new PrintType(manager);
        PrintType type2 = new PrintType(manager);

        assert !type2.isSubtypeOf(type1);
    }

}