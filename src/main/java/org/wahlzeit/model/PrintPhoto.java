package org.wahlzeit.model;

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
     * @methodtype get
     */
    public Material getPrintMaterial() {
        return this.printMaterial;
    }


}
