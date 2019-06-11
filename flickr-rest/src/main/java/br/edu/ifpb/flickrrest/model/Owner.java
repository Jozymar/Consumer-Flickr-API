package br.edu.ifpb.flickrrest.model;

import java.util.Objects;

public class Owner {

    private String nsid;

    private String username;

    private String realname;

    private String location;

    public Owner(String nsid, String username, String realname, String location) {
        this.nsid = nsid;
        this.username = username;
        this.realname = realname;
        this.location = location;
    }

    public String getNsid() {
        return nsid;
    }

    public void setNsid(String nsid) {
        this.nsid = nsid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(nsid, owner.nsid) &&
                Objects.equals(username, owner.username) &&
                Objects.equals(realname, owner.realname) &&
                Objects.equals(location, owner.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nsid, username, realname, location);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "nsid='" + nsid + '\'' +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
