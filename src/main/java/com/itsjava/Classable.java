package com.itsjava;

public interface Classable {
    static final int INFERIEUR = -1;
    static final int EGAL = 0;
    static final int SUPERIEUR = 1;
    static final int ERREUR = -99;

    // sera appelée pour comparer l'instance de l'objet
    // le retour sera un int
    int compare(Object o);
}
