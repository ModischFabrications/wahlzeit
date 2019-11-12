package org.wahlzeit.model;

import org.wahlzeit.services.LogBuilder;

import java.util.logging.Logger;

public class PrintPhotoFactory extends PhotoFactory {
    private static final Logger log = Logger.getLogger(PrintPhotoFactory.class.getName());

    /**
     * Hidden singleton instance; needs to be initialized from the outside.
     */
    private static PrintPhotoFactory instance = null;

    /**
     * Hidden singleton instance; needs to be initialized from the outside.
     */
    public static void initialize() {
        getInstance(); // drops result due to getInstance() side-effects
    }

    /**
     * Public singleton access method.
     */
    public static synchronized PrintPhotoFactory getInstance() {
        if (instance == null) {
            log.config(LogBuilder.createSystemMessage().addAction("setting PrintPhotoFactory").toString());
            setInstance(new PrintPhotoFactory());
        }

        return instance;
    }

    /**
     * Method to set the singleton instance of *Print*PhotoFactory.
     * This is needed because the base class uses another instance as the inherited class
     */
    protected static synchronized void setInstance(PrintPhotoFactory photoFactory) {
        if (instance != null) {
            throw new IllegalStateException("attempt to initalize PrintPhotoFactory twice");
        }

        instance = photoFactory;
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
