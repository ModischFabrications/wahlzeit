package org.wahlzeit.model;

import com.google.appengine.api.images.Image;

import java.io.IOException;

public class PrintPhotoManager extends PhotoManager {

    protected static final PrintPhotoManager instance = new PrintPhotoManager();

    // TODO: is that necessary?
    public PrintPhotoManager() {
        super();
    }

    public static PrintPhotoManager getInstance() {
        return instance;
    }

    @Override
    public PrintPhoto getPhoto(PhotoId id) {
        return (PrintPhoto) super.getPhoto(id);
    }

    @Override
    public PrintPhoto getPhotoFromId(PhotoId id) {
        return (PrintPhoto) super.getPhotoFromId(id);
    }

    public void savePhoto(PrintPhoto photo) {
        super.savePhoto(photo);
    }

    @Override
    public PrintPhoto createPhoto(String filename, Image uploadedImage) throws Exception {
        return (PrintPhoto) super.createPhoto(filename, uploadedImage);
    }

    public void addPhoto(PrintPhoto photo) throws IOException {
        super.addPhoto(photo);
    }

    @Override
    public PrintPhoto getVisiblePhoto(PhotoFilter filter) {
        return (PrintPhoto) super.getVisiblePhoto(filter);
    }

}
