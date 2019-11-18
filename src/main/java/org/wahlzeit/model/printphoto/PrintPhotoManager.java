package org.wahlzeit.model.printphoto;

import com.google.appengine.api.images.Image;
import org.wahlzeit.model.PhotoFilter;
import org.wahlzeit.model.PhotoId;
import org.wahlzeit.model.PhotoManager;

import java.io.IOException;

public class PrintPhotoManager extends PhotoManager {

    protected static final PrintPhotoManager instance = new PrintPhotoManager();

    public static PrintPhotoManager getInstance() {
        return instance;
    }

    @Override
    public PrintPhoto getPhoto(PhotoId id) {
        return instance.getPhotoFromId(id);
    }

    @Override
    public PrintPhoto getPhotoFromId(PhotoId id) {
        // reimplemented to point to the correct instance of the manager

        if (id == null) {
            return null;
        }

        PrintPhoto result = (PrintPhoto) doGetPhotoFromId(id);

        if (result == null) {
            result = PrintPhotoFactory.getInstance().loadPhoto(id);
            if (result != null) {
                doAddPhoto(result);
            }
        }

        return result;
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
