package personnage;

import java.util.Scanner;

public class Personnage  {
    String nom;
    String image;
    int vie;
    int attaque;

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez-lui un nom");
        nom = sc.nextLine();
        while (nom.equals("")) {
            System.out.println("Donnez-lui un nom");
            nom = sc.nextLine();
        }
        System.out.println("Il portera le charmant nom de " + nom);
        System.out.println("Donnez-lui une image mais qui soit une chaine de caractères !!!");
        image = sc.nextLine();
        while (image.equals("")) {
            System.out.println("Donnez-lui une image mais qui soit une chaine de caractères !!!");
            image = sc.nextLine();
        }
        System.out.println("Il aura la bouille suivante " + image);
        System.out.println("Donnez-lui un niveau de vie entre 0 et 100");
        vie = sc.nextInt();

        if (vie < 0 || vie > 100) {
            System.out.println("Tant pis, vous  ne pouviez dépasser 100...");
            vie = 80;
        }
        System.out.println("Il aura le niveau de vie " + vie);
        System.out.println("Donnez-lui un niveau de force entre 0 et 100!");
        attaque = sc.nextInt();
        if (attaque < 0 || attaque > 100) {
            System.out.println("Tant pis, vous ne pouviez dépasser 100...");
            attaque = 80;
        }
        System.out.println("Il aura la force suivante " + attaque);
//        sc.nextLine();
    }
    public String toString() {
        return  "Nom : " + nom + " \nImage : " + image +"\nVie : " + vie + "\nForce : " + attaque;
    }
}
