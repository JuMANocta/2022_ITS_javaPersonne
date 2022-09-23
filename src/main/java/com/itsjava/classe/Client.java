package com.itsjava.classe;

import java.util.GregorianCalendar;

public class Client extends Personne{
    // déterminer un type de client : P->particulier E->entreprise A->administration
    private char type;

    public Client(){
        super(); // appel du contructeur parent
    }

    public Client(String nom, String prenom, GregorianCalendar date_naiss, char type){
        super(nom, prenom, date_naiss);
        this.type = type;
    }

    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        this.type = type;
    }

}
