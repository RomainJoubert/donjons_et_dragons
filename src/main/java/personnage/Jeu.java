package personnage;

import java.util.Scanner;


public class Jeu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tableauPersonnage[] = {"guerrier", "magicien"};
        char reponse1 = ' ';
        System.out.println("Liste des personnages : ");
        for (int i = 0; i < tableauPersonnage.length; i++) {
            System.out.println(tableauPersonnage[i]);
        }
        do {
            reponse1 = ' ';
            System.out.println("Veuillez choisir un personnage : ");
            String reponse = sc.nextLine();
            Guerrier guerrier1 = new Guerrier();
            Magicien magicien1 = new Magicien();
            if (reponse.equals("guerrier")) {
                System.out.println("Vous avez choisi " + reponse);
                guerrier1.creation();
                System.out.println("Vous souhaitez  modifier votre personnage : 1 ou afficher les caractéristiques de votre personnage : 2 ?");
                if (sc.nextLine().equals("2")) {
                    System.out.println(guerrier1);
                }


            } else if (reponse.equals("magicien")) {
                System.out.println("Vous avez choisi " + reponse);
                magicien1.creation();
                System.out.println("Vous souhaitez  modifier votre personnage : 1 ou afficher les caractéristiques de votre personnage : 2 ?");
                if (sc.nextLine().equals("2")) {
                    System.out.println(magicien1);
                }
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
        System.out.println();
    }
}





