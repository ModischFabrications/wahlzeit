package org.wahlzeit.model.printphoto.typeobjects;

import java.util.HashSet;
import java.util.Set;

public class PrintType {
    private PrintManager manager;

    private PrintType superType;

    // useless?
    private Set<PrintType> subTypes = new HashSet<>();

    public PrintType(PrintManager manager) {
        this.manager = manager;
    }

    public void addSubType(PrintType subType) {
        assert subType != null;

        subType.setSuperType(this);
        subTypes.add(subType);
    }

    // differs from task because it's a better defined description
    public boolean isSubtypeOf(PrintType type) {
        // differs from example but I want to handle it similar to equals()
        if (type == null) return false;

        // noone can be a subtype
        if (this.superType == null) return false;

        if (this.superType == type) return true;

        // recursive!
        return this.superType.isSubtypeOf(type);

        // the example of the lecture seems to mean something else...
        //if (type == this) return true;

/*        for (PrintType subtype : subTypes) {
            if (subtype.isSubtypeOf(type)) return true;
        }*/
    }

    public PrintType getSuperType() {
        return superType;
    }

    public void setSuperType(PrintType superType) {
        this.superType = superType;
    }

    public PrintType[] getSubTypes() {
        // because it's read-only!
        return (PrintType[]) subTypes.toArray();
    }
}
