package br.edu.ifpb.flickrrest.model;

import java.io.Serializable;
import java.util.Objects;

public class Photo implements Serializable {

    private String id;

    private String secret;

    private String server;

    private Integer farm;

    private String dateuploaded;

    private Integer isfavorite;

    private String license;

    private String safety_level;

    private Integer rotation;

    private String originalsecret;

    private String originalformat;

    private Owner owner;

    public Photo(String id, String secret, String server, Integer farm, String dateuploaded, Integer isfavorite, String license, String safety_level, Integer rotation, String originalsecret, String originalformat, Owner owner) {
        this.id = id;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
        this.dateuploaded = dateuploaded;
        this.isfavorite = isfavorite;
        this.license = license;
        this.safety_level = safety_level;
        this.rotation = rotation;
        this.originalsecret = originalsecret;
        this.originalformat = originalformat;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getFarm() {
        return farm;
    }

    public void setFarm(Integer farm) {
        this.farm = farm;
    }

    public String getDateuploaded() {
        return dateuploaded;
    }

    public void setDateuploaded(String dateuploaded) {
        this.dateuploaded = dateuploaded;
    }

    public Integer getIsfavorite() {
        return isfavorite;
    }

    public void setIsfavorite(Integer isfavorite) {
        this.isfavorite = isfavorite;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getSafety_level() {
        return safety_level;
    }

    public void setSafety_level(String safety_level) {
        this.safety_level = safety_level;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public String getOriginalsecret() {
        return originalsecret;
    }

    public void setOriginalsecret(String originalsecret) {
        this.originalsecret = originalsecret;
    }

    public String getOriginalformat() {
        return originalformat;
    }

    public void setOriginalformat(String originalformat) {
        this.originalformat = originalformat;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(id, photo.id) &&
                Objects.equals(secret, photo.secret) &&
                Objects.equals(server, photo.server) &&
                Objects.equals(farm, photo.farm) &&
                Objects.equals(dateuploaded, photo.dateuploaded) &&
                Objects.equals(isfavorite, photo.isfavorite) &&
                Objects.equals(license, photo.license) &&
                Objects.equals(safety_level, photo.safety_level) &&
                Objects.equals(rotation, photo.rotation) &&
                Objects.equals(originalsecret, photo.originalsecret) &&
                Objects.equals(originalformat, photo.originalformat) &&
                Objects.equals(owner, photo.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secret, server, farm, dateuploaded, isfavorite, license, safety_level, rotation, originalsecret, originalformat, owner);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id='" + id + '\'' +
                ", secret='" + secret + '\'' +
                ", server='" + server + '\'' +
                ", farm=" + farm +
                ", dateuploaded='" + dateuploaded + '\'' +
                ", isfavorite=" + isfavorite +
                ", license='" + license + '\'' +
                ", safety_level='" + safety_level + '\'' +
                ", rotation=" + rotation +
                ", originalsecret='" + originalsecret + '\'' +
                ", originalformat='" + originalformat + '\'' +
                ", owner=" + owner +
                '}';
    }
}
