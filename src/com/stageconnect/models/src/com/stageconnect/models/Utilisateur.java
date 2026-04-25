
package com.stageconnect.models;

public class Utilisateur {

    private String nom;
    private String email;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void afficherDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Email: " + email);
    }
}
