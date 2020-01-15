package org.wahlzeit.model.printphoto.typeobjects;

import java.util.HashSet;
import java.util.Set;

public class PrintType {
    // could be implemented as value types if you have free time on your hands
    // and need something to do.
    // Value type is cleaner, but "singletoning" in manager is good enough for now

    // no idea why we need that but it's required
    private PrintManager manager;

    private PrintType superType;

    // useless, could be removed if noone ever needs it
    private Set<PrintType> subTypes = new HashSet<>();

    public PrintType(PrintManager manager) {
        assert manager != null;
        this.manager = manager;
    }

    /**
     * subtype constructor
     */
    public PrintType(PrintManager manager, PrintType superType) {
        assert manager != null;
        assert superType != null;
        this.manager = manager;
        this.superType = superType;
        superType.addSubType(this);
    }

    void addSubType(PrintType subType) {
        assert subType != null;

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

        // the example of the lecture seems to mean something else, don't copy it
    }

    public PrintType getSuperType() {
        return superType;
    }

    // immutability is better
    /*public void setSuperType(PrintType superType) {
        this.superType = superType;
    }*/

    public PrintType[] getSubTypes() {
        // because it's read-only!
        return (PrintType[]) subTypes.toArray();
    }
}
