package com.itsjava;

import lombok.*;

@Getter @Setter
public class Poisson extends EtreVivant {
    private String couleur;
    private String espece;

    public Poisson(double taille, double masse, String couleur, String espece) {
        super(taille, masse);
        setCouleur(couleur);
        setEspece(espece);
    }

    @Override
    public void parler() {
        System.out.println("Plop");
    }
    @Override
    public void seDeplacer() {
        System.out.println("Je nage");
    }
    @Override
    public void respirer() {
        System.out.println("oui mais dans l'eau");
    }
    @Override
    public void dormir() {
        System.out.println("zzzZZZzzz");
    }
    @Override
    public void mourir() {
        System.out.println("Arrrrrgggrrggrr");
    }

    public void executer(){
        parler();
        seDeplacer();
        respirer();
        dormir();
        mourir();
    }
}
