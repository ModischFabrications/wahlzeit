package org.wahlzeit.model;

public class PrintPhotoFactory extends PhotoFactory {
    /**
     * Hidden singleton instance; needs to be initialized from the outside.
     */
    private static PrintPhotoFactory instance = null;

    /**
     * Public singleton access method.
     */
    public static synchronized PrintPhotoFactory getInstance() {
        if (instance == null) {
            setInstance(new PhotoFactory());
        }

        return instance;
    }

    /**
     * @methodtype factory
     */
    @Override
    public PrintPhoto createPhoto() {
        return new PrintPhoto(PrintPhoto.Material.UNKNOWN);
    }

    /**
     * Creates a new photo with the specified id
     *
     * @param id
     */
    @Override
    public PrintPhoto createPhoto(PhotoId id) {
        return new PrintPhoto(id, PrintPhoto.Material.UNKNOWN);
    }

    /**
     * Loads a photo. The Java object is loaded from the Google Datastore, the Images in all sizes are loaded from the
     * Google Cloud storage.
     *
     * @param id
     */
    @Override
    public PrintPhoto loadPhoto(PhotoId id) {
        // I think the original is a placeholder...
        return null;
    }

}
