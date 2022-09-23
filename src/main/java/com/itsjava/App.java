package com.itsjava;

import java.util.GregorianCalendar;
import java.util.Scanner;

import com.itsjava.classe.*;
import com.itsjava.sqlite.Connexion;

public class App 
{
    public static void main( String[] args ){
        System.out.println( "Création d'un objet Personne" );
        Personne p0;
        p0 = new Personne();
        Personne p1 = new Personne();
        Personne p2 = new Personne("DOE", "Jhon", new GregorianCalendar(1983,10,8));

        // Scanner in = new Scanner(System.in, "UTF-8");
        // System.out.println("Quel est votre nom ? >> ");
        // String nom = in.nextLine();
        // System.out.println("Quel est votre prenom ? >> ");
        // String prenom = in.nextLine();
        // System.out.println("Quel est votre année de naiss ? >> ");
        // String annee = in.nextLine();
        // System.out.println("Quel est votre mois de naiss ? >> ");
        // String mois = in.nextLine();
        // System.out.println("Quel est votre jour de naiss ? >> ");
        // String jour = in.nextLine();
        // in.close();

        // Personne p3 = new Personne(nom, prenom, new GregorianCalendar(Integer.parseInt(annee), Integer.parseInt(mois), Integer.parseInt(jour)));

        //p3.affichage(true);
        p0.affichage(true);
        p1.affichage(true);
        p2.affichage(true);

        System.out.println(Personne.getNbInstance());

        Client c0 = new Client();
        Client c1 = new Client("Test", "test", new GregorianCalendar(1999,1,1),'E');

        System.out.println(Personne.getNbInstance());

        Poisson poisson = new Poisson(20.0, 1.0, "rouge", "espece");
        poisson.executer();

        //p0.compare(p1);
        //p0.compare(in);
        //p0.compare(c0);
        //p1.compare(c1);
        //p0.compare(poisson);

        Connexion.bdConnexion(p2);
    }
}
