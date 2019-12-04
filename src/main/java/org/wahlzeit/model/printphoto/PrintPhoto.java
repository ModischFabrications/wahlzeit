package org.wahlzeit.model.printphoto;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;

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


}
