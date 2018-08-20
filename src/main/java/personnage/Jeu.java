package personnage;

import java.util.Scanner;
import java.util.ArrayList;
//import static java.lang.System.*; //permet de ne plus taper System dans le code

/**
 * The type Jeu.
 */
public class Jeu extends Personnage {

    private static Scanner sc = new Scanner(System.in);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

//        tableau qui affiche le choix des personnanges
        String tableauPersonnage[] = {"guerrier", "magicien"};


// -------------------boucle qui parcourt le tableau des personnages et les affiche------
        System.out.println("Liste des personnages : ");
        for (int i = 0; i < tableauPersonnage.length; i++) {
            System.out.println(tableauPersonnage[i]);
        }
        Personnage p = null;
        String toto = " ";
//        int reponse1;
        int choix;

        String reponse;
//        -------------Choisir le personnage que l'on veut créer----------------
        do {
            System.out.println("Veuillez choisir un personnage : ");
            reponse = sc.nextLine();
            if (reponse.equals("guerrier")) {
                System.out.println("Vous avez choisi " + reponse);
                toto = reponse;
                p = createGuerrier();
            } else if (reponse.equals("magicien")) {
                System.out.println("Vous avez choisi " + reponse);
                toto = reponse;
                p = createMagicien();
            } else {
                System.out.println("Le personnage " + reponse + " n'existe pas ");

//                do {
//                    System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
//                    String reponse1 = sc.nextLine();
//
//                } while (reponse3 != 'N' && reponse3 != 'O');
////                if (reponse3 == 'N')
//                    System.out.println("Au revoir !");
            }
        } while (!reponse.equals("guerrier") && !reponse.equals("magicien"));

//----------------------affiche le menu-----------------------------------------
        do {
            System.out.println("Vous voulez afficher votre personnage : 1 ou vous souhaitez le modifier : 2 ou attaquer : 3 ou sortir : 0");
            choix = sc.nextInt();
            int choix2;

            switch (choix) {
                case 1:
                    System.out.println(p);
                    break;
                case 2:
                    System.out.println("Vous souhaitez modifier : \nle nom : 1 ; \nl'image : 2 ; \nla vie : 3 ; \nla force : 4");
                    if (toto.equals("magicien")) {
                        System.out.println("le sort : 5 ; \nle philtre : 6");
                    } else {
                        System.out.println("l'arme : 5 ; \nle bouclier : 6");
                    }
                    choix2 = sc.nextInt();
                    sc.nextLine();

                    switch (choix2) {
                        case 1:
                            System.out.println("Vous souhaitez changer le nom de votre personnage " + p.getNom() + " par : ");
                            p.setNom(donnerNom());
                            break;

                        case 2:
                            System.out.println("Vous souhaitez changer l'image de votre personnage " + p.getImage() + " par : ");
                            p.setImage(donnerImage());
                            break;

                        case 3:
                            System.out.println("Vous souhaitez changer le niveau de vie de votre personnage" + p.getVie() + " par : ");
                            p.setVie(donnerVie());
                            break;

                        case 4:
                            System.out.println("Vous souhaitez changer le niveau de vie de votre personnage" + p.getForce() + " par : ");
                            p.setForce(donnerForce());
                            break;

                        case 5:
                            if (toto.equals("magicien")) {
                                System.out.println("Vous souhaitez modfier le sort de votre personnage ");
                                String nouveauSort = sc.nextLine();
                                System.out.println("Voici son nouveau sort " + nouveauSort);
                            } else {
                                System.out.println("Vous souhaitez modfier les armes de votre personnage ? (O/N) ");
                                if (sc.nextLine().equals("O")) {
                                    ((Guerrier) p).setTableauArme(donnerArme());
                                }
                            }
                            break;
                        case 6:
                            if (toto.equals("magicien")) {
                                System.out.println("Vous souhaitez modfier le philtre de votre personnage ");
                                String nouveauPhiltre = sc.nextLine();
                                System.out.println("Voici son nouveau philtre " + nouveauPhiltre);
                            } else {
                                System.out.println("Vous souhaitez modfier le bouclier de votre personnage ");
                                String nouveauBouclier = sc.nextLine();
                                System.out.println("Voici son nouveau philtre " + nouveauBouclier);
                            }
                        default:
                            System.out.println("test");
                            break;
                    }
                    break;
                case 3 : attaquer(p);
                default:

            }
        }
        while (choix != 0);

    }

    /**
     * Create guerrier personnage.
     *
     * @return the personnage
     */
//----------------------Méthode pour créer un guerrier-------------------------
    public static Personnage createGuerrier() {
        Guerrier guerrier1 = new Guerrier();

        guerrier1.setNom(donnerNom());
        guerrier1.setImage(donnerImage());
        guerrier1.setVie(donnerVie());
        guerrier1.setForce(donnerForce());
        guerrier1.setTableauArme(donnerArme());
        guerrier1.setBouclier(donnerBouclier());
        return guerrier1;
    }

    /**
     * Create magicien personnage.
     *
     * @return the personnage
     */
//----------------Méthode pour créer un magicien---------------------------
    public static Personnage createMagicien() {
        Magicien magicien1 = new Magicien();

        magicien1.setNom(donnerNom());
        magicien1.setImage(donnerImage());
        magicien1.setVie(donnerVie());
        magicien1.setForce(donnerForce());
        magicien1.setPhiltre(donnerPhiltre());
        magicien1.setSort(donnerSort());
        return magicien1;
    }


    /**
     * Donner nom string.
     *
     * @return the string
     */
//----------------------Méthode pour donner un nom au personnage------------------
    public static String donnerNom() {
        System.out.println("Donnez-lui un nom");
        String nom = sc.nextLine();
        while (nom.equals("")) {
            System.out.println("Donnez-lui un nom");
            nom = sc.nextLine();
        }
        System.out.println("Il portera le charmant nom de " + nom);
        return nom;
    }

    /**
     * Donner image string.
     *
     * @return the string
     */
//------------------Méthode pour donner une image au personnage---------------
    public static String donnerImage() {
        System.out.println("Donnez-lui une image mais qui soit une chaine de caractères !!!");
        String image = sc.nextLine();
        while (image.equals("")) {
            System.out.println("Donnez-lui une image mais qui soit une chaine de caractères !!!");
            image = sc.nextLine();
        }
        System.out.println("Il aura la bouille suivante " + image);
        return image;
    }

    /**
     * Donner vie int.
     *
     * @return the int
     */
//-----------------------Méthode pour donner un niveau de vie au personnage--------------
    public static int donnerVie() {
        System.out.println("Donnez-lui un niveau de vie entre 0 et 100");
        int vie = sc.nextInt();
        sc.nextLine();

        if (vie < 0 || vie > 100) {
            System.out.println("Tant pis, vous  ne pouviez dépasser 100...");
            vie = 80;
        }
        System.out.println("Il aura le niveau de vie " + vie);
        return vie;
    }

    /**
     * Donner force int.
     *
     * @return the int
     */
//---------------------------Méthode pour donner un niveau de force au personnage--------
    public static int donnerForce() {
        System.out.println("Donnez-lui un niveau de force entre 0 et 100!");
        int force = sc.nextInt();
        sc.nextLine();
        if (force < 0 || force > 100) {
            System.out.println("Tant pis, vous ne pouviez dépasser 100...");
            force = 80;
        }
        System.out.println("Il aura la force suivante " + force);
        return force;
    }

    /**
     * Donner sort string.
     *
     * @return the string
     */
//    ----------------Méthode pour donner un sort au magicien------------------
    public static String donnerSort() {
        System.out.println("Donnez-lui un sort");
        String sort = sc.nextLine();
        while (sort.equals("")) {
            System.out.println("Donnez-lui un sort");
            sort = sc.nextLine();
        }
        System.out.println("Il aura le sort suivant " + sort);
        return sort;
    }

    /**
     * Donner philtre string.
     *
     * @return the string
     */
//    -------------------Méthode pour donner un philtre au magicien-----------
    public static String donnerPhiltre() {
        System.out.println("Donnez-lui un philtre pour se protéger");
        String philtre = sc.nextLine();
        while (philtre.equals("")) {
            System.out.println("Donnez-lui un philtre pour se protéger");
            philtre = sc.nextLine();
        }
        System.out.println("Il aura la protection suivante " + philtre);
        return philtre;
    }

    /**
     * Donner arme string [ ].
     *
     * @return the string [ ]
     */
// ------------------- Methode qui permet d'ajouter une arme et de la stocker dans un tableau---------------------------
    public static String[] donnerArme() {
        String tabWeapon[] = new String[5];
        int cpt = 1;
        String choice;
        do {
            System.out.println("Donnez-lui une arme");
            tabWeapon[cpt] = sc.nextLine();
            cpt = cpt + 1 ;
            System.out.println("Voulez-vous lui donner une autre arme ? (O/N)");
            choice = sc.nextLine();
        }
        while (choice.equals("O") && cpt <= 5);

//        while (choice.equals("")) {
//            System.out.println("Donnez-lui une arme");
//            choice = sc.nextLine();
//        }
        System.out.println("Il aura l'arme suivante " + choice);
        return tabWeapon;
    }

    /**
     * Donner bouclier string.
     *
     * @return the string
     */
//----------------------Méthode pour ajouter un bouclier-----------------------------------------
    public static String donnerBouclier() {
        System.out.println("Donnez-lui un bouclier");
        String bouclier = sc.nextLine();
        while (bouclier.equals("")) {
            System.out.println("Donnez-lui un bouclier");
            bouclier = sc.nextLine();
        }
        System.out.println("Il aura la protection suivante " + bouclier);
        return bouclier;
    }

    /**
     * Attaquer int.
     *
     * @param z the z
     * @return the int
     */
//--------------------Méthode pour attaquer et qui déduit le niveau de l'attaque de la force restante-------------
    public static int attaquer(Personnage z) {
        System.out.println("Vous souhaitez attaquer votre ennemi. Votre force est de " + z.getForce() +
         " saisissez une force d'attaque inférieure ou égale à " +  z.getForce());
        int frappe = sc.nextInt();
        if (frappe > z.getForce())
        {
            System.out.println("Vous ne pouvez pas faire une attaque supérieure à votre force");
            System.out.println("Saisissez votre niveau d'attaque");
            frappe = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Vous avez saisi " + frappe);
        int reste = z.getForce() - frappe;
        System.out.println("Il vous reste en force : " + reste);
        z.setForce(reste);
    return reste ;
    }
//--------------------------------- Méthode pour stocker les personnages-----------------------------
//    public static String[] ajouterPersonnage(Personnage p){
//        ArrayList al = new ArrayList();
//        al.add(p.getNom());
//
//        for (int i =0;  i< al.size(); i++)
//        {
//            System.out.println("vous venez d'ajouter le personnage " + al.get(i) + " "+ i;
//        }
//        return ;
//    }
}








