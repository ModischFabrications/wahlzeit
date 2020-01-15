package org.wahlzeit.model.printphoto;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;
import org.wahlzeit.model.printphoto.typeobjects.Print;

public class PrintPhoto extends Photo {
    // TODO: should be added to the UI
    public enum Material {
        UNKNOWN,
        PLA,
        PETG,
        ABS,
        TPU
    }
    private Material printMaterial = Material.UNKNOWN;

    private Print print = null;
    /**
     *
     */
    public PrintPhoto(Material printMaterial) throws IllegalArgumentException {
        super();
        // precondition
        if (printMaterial == null) throw new IllegalArgumentException("Material not defined");

        this.printMaterial = printMaterial;
    }

    /**
     * @methodtype constructor
     */
    public PrintPhoto(PhotoId myId, Material printMaterial) throws IllegalArgumentException {
        super(myId);
        // precondition
        if (printMaterial == null) throw new IllegalArgumentException("Material not defined");

        this.printMaterial = printMaterial;
    }

    /**
     * @methodtype get
     */
    public Material getPrintMaterial() {
        return this.printMaterial;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }


}
