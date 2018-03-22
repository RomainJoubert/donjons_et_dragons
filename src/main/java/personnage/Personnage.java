package personnage;

import java.util.Scanner;

public class Personnage {
    Scanner sc = new Scanner(System.in);
    private String nom;
    private String image;
    private int vie;
    private int attaque;


    public String toString() {
        return "Nom : " + nom + " \nImage : " + image + "\nVie : " + vie + "\nForce : " + attaque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }


}
