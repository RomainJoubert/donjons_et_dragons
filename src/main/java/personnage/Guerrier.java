package personnage;

import java.util.Scanner;

public class Guerrier extends Personnage {
        String arme;
        String bouclier;

    public void addWeapon()
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Donnez-lui une arme");
            arme = sc.nextLine();
            while (arme.equals("")) {
                System.out.println("Donnez-lui une arme");
                arme = sc.nextLine();
            }
            System.out.println("Il aura l'arme suivante " + arme);
            System.out.println("Donnez-lui un bouclier");
            bouclier = sc.nextLine();
            while (bouclier.equals("")) {
                System.out.println("Donnez-lui un bouclier");
                bouclier = sc.nextLine();
            }
            System.out.println("Il aura la protection suivante " + bouclier);
        }
    public String toString() {
        return super.toString()+ "\nArme : "+ arme + "\nBouclier : " + bouclier;
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public String getBouclier() {
        return bouclier;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }
}
