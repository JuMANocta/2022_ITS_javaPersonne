package com.itsjava;

import java.util.GregorianCalendar;
import java.util.Random;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Personne {
    @Getter
    String nom;
    @Getter
    String prenom;
    @Getter @Setter
    GregorianCalendar date_naiss = new GregorianCalendar();
    // variable privée représentant le numéro de la personne
    @Getter @Setter
    int numPersonne;
    // variable static privée représentant le compteur de création de Personne
    @Getter
    static int nbInstance;
    {nbInstance++;}

    // Constructeur simple généré par lombok

    // Constructeur surchargé
    Personne(String nom, String prenom, GregorianCalendar date_naiss) {
        System.out.println("Constructeur surchargé");
        setNom(nom);
        setPrenom(prenom);
        setDate_naiss(date_naiss);
        setNumPersonne(new Random().nextInt(1000));
    }

    // Destructeur
    protected void finalize() throws Throwable{
        System.out.println("Destruction de l'objet Personne");
    }

    // Méthode pour calculer l'age
    public long calculAge(){
        long age;
        date_naiss = getDate_naiss();
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
        System.out.println("Numéro client : " + getNumPersonne());
    }
    //Méthode pour afficher des informations et si c'est autre que fr alors on affiche en anglais
    public void affichage(boolean fr){
        if(fr){
            affichage();
        }else{
            System.out.println("Last name : " + getNom());
            System.out.println("First name : " + getPrenom());
            System.out.println("Age : " + calculAge());
            System.out.println("Client number: " + getNumPersonne());
        }
    }
    // Getter Setter afin d'accéder à nos varibles déclarées en privées

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom.substring(0,1).toUpperCase() 
                        + prenom.substring(1).toLowerCase();
    }

}
// fin de la class