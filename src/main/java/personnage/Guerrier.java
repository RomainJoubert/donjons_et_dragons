package personnage;
import java.util.Scanner;

public class Guerrier extends Jeu {


        String nom;
        String image;
        int vie;
        int force;
        String arme;
        String bouclier;

    public void creation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez-lui un nom");
        nom = sc.nextLine();
        while(nom.equals("")){
            System.out.println("Donnez-lui un nom");
            nom = sc.nextLine();
        }
        System.out.println("Il portera le charmant nom de " + nom);
        System.out.println("Donnez-lui une image mais qui soit une chaine de caractères !!!");
        image = sc.nextLine();
        while(nom.equals("")) {
            System.out.println("Donnez-lui une image mais qui soit une chaine de caractères !!!");
            nom = sc.nextLine();
        }
        System.out.println("Il aura la bouille suivante " + image);
        System.out.println("Donnez-lui un niveau de vie entre 0 et 100");
        vie = sc.nextInt();
        if (vie >100) {
            System.out.println("Tant pis, vous  ne pouviez dépasser 100...");
            vie = 80;
        }
        System.out.println("Il aura le niveau de vie " + vie);
        System.out.println("Donnez-lui un niveau de force entre 0 et 100!");
        force = sc.nextInt();
        if (force >100) {
            System.out.println("Tant pis, vous ne pouviez dépasser 100...");
            force = 80;
        }
        System.out.println("Il aura la force suivante " + force);
        sc.nextLine();
        System.out.println("Donnez-lui une arme");
        arme = sc.nextLine();
            while(nom.equals("")) {
                System.out.println("Donnez-lui une arme");
                nom = sc.nextLine();
            }
        System.out.println("Il aura l'arme suivante " + arme);
        System.out.println("Donnez-lui un bouclier");
        bouclier = sc.nextLine();
                while(nom.equals("")){
                    System.out.println("Donnez-lui un bouclier");
                    nom = sc.nextLine();
                }
        System.out.println("Il aura la protection suivante " + bouclier);
    }
    public String toString() {
        return  "Nom : " + nom + " \nImage : " + image +"\nVie : " + vie + "\nForce : " + force + "\nArme : "+ arme + "\nBouclier : " + bouclier;
    }
}