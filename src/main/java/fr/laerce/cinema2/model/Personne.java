package fr.laerce.cinema2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Personne {
    private String nom;
    private String prenom;
    private Integer naissance;
    private String photoPath;
    public List<Role> roles=new ArrayList<>();

    public Personne(String nom, String prenom, Integer naissance, String photoPath) {
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.photoPath = photoPath;
    }

    public Personne() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getNaissance() {
        return naissance;
    }

    public void setNaissance(Integer naissance) {
        this.naissance = naissance;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role){
        this.roles.add(role);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne)) return false;
        Personne personne = (Personne) o;
        return Objects.equals(getNom(), personne.getNom()) &&
                Objects.equals(getPrenom(), personne.getPrenom()) &&
                Objects.equals(getNaissance(), personne.getNaissance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom(), getNaissance());
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", naissance=" + naissance +
                ", photoPath='" + photoPath + '\'' +
                '}';
    }
}
