package br.edu.ifpb.flickrrest.model;

import java.io.Serializable;

public class Photos implements Serializable {

    private Photo photo;

    public Photos(Photo photo) {
        this.photo = photo;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Photos{" +
                "photo=" + photo +
                '}';
    }
}
