package com.itsjava;

import lombok.*;

@AllArgsConstructor
@Getter @Setter
public abstract class EtreVivant {
    private double taille;
    private double masse;

    // CONSTRUC généré par lombok

    // MéTHODES de class
    public abstract void parler();
    public abstract void seDeplacer();
    public abstract void respirer();
    public abstract void dormir();
    public abstract void mourir();

    // GETTER SETTER généré par lombok
}
