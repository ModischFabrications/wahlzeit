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
    public PrintPhoto(Material printMaterial) {
        super();
        this.printMaterial = printMaterial;
    }

    /**
     * @methodtype constructor
     */
    public PrintPhoto(PhotoId myId, Material printMaterial) {
        super(myId);
        this.printMaterial = printMaterial;
    }

    /**
     * @methodtype get
     */
    public Material getPrintMaterial() {
        return this.printMaterial;
    }


}
