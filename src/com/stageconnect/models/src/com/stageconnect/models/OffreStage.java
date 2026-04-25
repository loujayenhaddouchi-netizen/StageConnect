package com.stageconnect.models;

public class OffreStage {

    private String titre;
    private String entreprise;
    private int placesDisponibles;

    public OffreStage() {
    }

    public OffreStage(String titre, String entreprise, int placesDisponibles) {
        this.titre = titre;
        this.entreprise = entreprise;
        this.placesDisponibles = placesDisponibles;
    }

    public String getTitre() {
        return titre;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public int getPlacesDisponibles() {
        return placesDisponibles;
    }

    // 🔥 LOGIQUE MÉTIER (important pour Sprint 2)
    public boolean reserverPlace() {
        if (placesDisponibles > 0) {
            placesDisponibles--;
            return true;
        } else {
            System.out.println("❌ Plus de places disponibles !");
            return false;
        }
    }

    public void afficherOffre() {
        System.out.println("Offre: " + titre + " | Entreprise: " + entreprise);
        System.out.println("Places restantes: " + placesDisponibles);
    }
}
