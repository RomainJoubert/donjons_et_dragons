package personnage;

import java.util.Scanner;

public class Jeu extends Personnage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tableauPersonnage[] = {"guerrier", "magicien"};
        char reponse1 = ' ';
        int choix;
        System.out.println("Liste des personnages : ");
        for (int i = 0; i < tableauPersonnage.length; i++) {
            System.out.println(tableauPersonnage[i]);
        }
        Personnage affichePersonnage = null;
        do {
            reponse1 = ' ';
            System.out.println("Veuillez choisir un personnage : ");
            String reponse = sc.nextLine();
            Guerrier guerrier1 = new Guerrier();
            Magicien magicien1 = new Magicien();
            if (reponse.equals("guerrier")) {
                System.out.println("Vous avez choisi " + reponse);
                affichePersonnage = guerrier1;
                guerrier1.create();
                guerrier1.addWeapon();


            } else if (reponse.equals("magicien")) {
                System.out.println("Vous avez choisi " + reponse);
                affichePersonnage = magicien1;
                magicien1.create();
                magicien1.addPower();


            } else {
                System.out.println("Le personnage " + reponse + " n'existe pas ");
                do {
                    System.out.println("Voulez-vous essayer à nouveau ? (O/N)");

                    reponse1 = sc.nextLine().charAt(0);
                }
                while (reponse1 != 'N' && reponse1 != 'O');
                if (reponse1 == 'N')
                    System.out.println("Au revoir !");
            }
        }
        while (reponse1 == 'O');


        do {
            System.out.println("Vous voulez afficher votre personnage : 1 ou vous souhaitez le modifier : 2 ");
            choix = sc.nextInt();
            if (choix == 1) {
                System.out.println(affichePersonnage);
            }
        } while
                (choix != 1 && choix != 2);
    }
}








