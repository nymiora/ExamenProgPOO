package com.Examen;



import lombok.Getter;
import lombok.Setter;

public class Ligue extends Match{
@Getter
@Setter

    private String nom;
    private Combattants combattants;
    private Match match;




    public void creerMatch(String nom,Combattants combattants, TypeMatch match){
        this.nom = nom;
        this.combattants = combattants;


        if(match == null && combattants == null ){
            System.out.println("Le match ne peut pas etre cree");
    }


}
//methodes: creer des matchs
