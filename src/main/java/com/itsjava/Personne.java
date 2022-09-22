package com.itsjava;

import java.util.GregorianCalendar;

public class Personne {
    private String nom;
    private String prenom;
    private GregorianCalendar date_naiss;
    // variable privée représentant le numéro de la personne
    private int numPersonne;
    // variable static privée représentant le compteur de création de Personne
    private static int nbInstance;

    // Constructeur simple
    Personne(){
        System.out.println("Constructeur Simple");
        nom = "";
        prenom = "";
        date_naiss = null;
    }
    // Constructeur surchargé
    Personne(String nom, String prenom, GregorianCalendar date_naiss) {
        System.out.println("Constructeur surchargé");
        setNom(nom);
        setPrenom(prenom);
        this.date_naiss = date_naiss;
    }

    // Destructeur
    protected void finalize() throws Throwable{
        System.out.println("Destruction de l'objet Personne");
    }

    // Méthode pour calculer l'age
    public long calculAge(){
        long age;
        date_naiss = new GregorianCalendar(1983,10,8);
        age = new GregorianCalendar().getTimeInMillis() - date_naiss.getTimeInMillis();
        age = age / 1000 / 60 / 60 / 24 / 365;
        return age;
    }
    // Méthode pour afficher des informations de personne
    @Deprecated
    public void affichage(){
        System.out.println("Nom : " + getNom());
        System.out.println("Prénom : " + getPrenom());
        System.out.println("Age : " + calculAge());
    }
    //Méthode pour afficher des informations et si c'est autre que fr alors on affiche en anglais
    public void affichage(boolean fr){
        if(fr){
            affichage();
        }else{
            System.out.println("Last name : " + getNom());
            System.out.println("First name : " + getPrenom());
            System.out.println("Age : " + calculAge());
        }
    }
    // Getter Setter afin d'accéder à nos varibles déclarées en privées
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom.substring(0,1).toUpperCase() 
                        + prenom.substring(1).toLowerCase();
    }

    public int getnumPersonne(){
        return numPersonne;
    }

    public static int getNbInstance(){
        return nbInstance;
    }

}
// fin de la class