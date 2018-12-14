package fr.laerce.cinema2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Film2 {
    private int id;
    private String titre;
    private Double notation;
    private String resume;
    private String affiche;
    private Personne0 realisateur;
    private List<Role> roles=new ArrayList<>();

    public Film2(int id, String titre, Double notation, String affiche, String resume, Personne0 realisateur) {
        this.id = id;
        this.titre = titre;
        this.notation = notation;
        this.resume = resume;
        this.affiche = affiche;
        this.realisateur = realisateur;
    }

    public Film2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Double getNotation() {
        return notation;
    }

    public void setNotation(Double notation) {
        this.notation = notation;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Personne0 getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Personne0 realisateur) {
        this.realisateur = realisateur;
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

    public String getAffiche() {
        return affiche;
    }

    public void setAffiche(String affiche) {
        this.affiche = affiche;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film2)) return false;
        Film2 film = (Film2) o;
        return Objects.equals(getTitre(), film.getTitre()) &&
                Objects.equals(getNotation(), film.getNotation()) &&
                Objects.equals(getResume(), film.getResume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitre(), getNotation(), getResume());
    }

    @Override
    public String toString() {
        return "Film2{" +
                "titre='" + titre + '\'' +
                ", notation=" + notation +
                ", resume='" + resume + '\'' +
                ", realisateur=" + realisateur +
                '}';
    }
}
