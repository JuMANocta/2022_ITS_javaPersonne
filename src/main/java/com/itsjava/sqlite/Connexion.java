package com.itsjava.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itsjava.classe.Personne;

public class Connexion {

    public static void bdConnexion(Personne p){
        String url = "jdbc:sqlite:bdd.db";
        // try whith ressouces (ferme les objects de connexion)
        try(Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement();){
            Class.forName("org.sqlite.JDBC");
            System.out.println("La connexion est bien reel !");

            String sqlCreate = "CREATE TABLE IF NOT EXISTS client (id_client INTEGER PRIMARY KEY AUTOINCREMENT,nom NVARCHAR(20), prenom NVARCHAR(20), type NCHAR(1), date_naiss DATE, numPers INT(3))";
            Boolean create = stmt.execute(sqlCreate);
            System.out.println(create?"Création BDD":"BDD déjà crée");

            String ajout = "INSERT INTO client (nom, prenom, numPers) VALUES ('" + p.getNom() + "','" + p.getPrenom() + "'," + p.getNumPersonne() + ")";
            stmt.execute(ajout);

            ResultSet rs = stmt.executeQuery("SELECT * FROM client");

            while(rs.next()){
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                // TODO Date date_naiss = rs.getString("date_naiss");
                String numPersonne = rs.getString("numPers");
                System.out.println(nom + " " + prenom + " " + numPersonne);
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("AU FEUUUUUUUUUU !!!");
            e.printStackTrace();
        }
    }
}
