package com.itsjava.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {

    public static void testConnexion(){
        String url = "jdbc:sqlite:bdd.db";
        // try whith ressouces (ferme les objects de connexion)
        try(Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement();){
            System.out.println("La connexion est bien reel !");

            String sqlCreate = "CREATE TABLE IF NOT EXISTS client (id_client INTEGER PRIMARY KEY AUTOINCREMENT,nom NVARCHAR(20), prenom NVARCHAR(20), type NCHAR(1), date_naiss DATE, numPers INT(3))";
            Boolean create = stmt.execute(sqlCreate);
            System.out.println(create?"Création BDD":"BDD déjà crée");

        } catch (SQLException e) {
            System.out.println("AU FEUUUUUUUUUU !!!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testConnexion();
    }
}
