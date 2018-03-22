package personnage;

import java.util.Scanner;

public class Jeu extends Personnage {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        tableau qui affiche le choix des personnanges
        String tableauPersonnage[] = {"guerrier", "magicien"};


//        boucle qui parcourt le tableau des personnages
        System.out.println("Liste des personnages : ");
        for (int i = 0; i < tableauPersonnage.length; i++) {
            System.out.println(tableauPersonnage[i]);
        }
        Personnage p = null;
        String toto = " ";
        int reponse1;
        int choix;
//            je remets ma variable reponse1 à nul
//        reponse1 = sc.nextInt();
        String reponse;
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
                                System.out.println("Vous souhaitez modfier l'arme de votre personnage ");
                                String nouvelleArme = sc.nextLine();
                                System.out.println("Voici son nouvelle arme " + nouvelleArme);
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

    public static Personnage createGuerrier() {
        Guerrier guerrier1 = new Guerrier();

        guerrier1.setNom(donnerNom());
        guerrier1.setImage(donnerImage());
        guerrier1.setVie(donnerVie());
        guerrier1.setForce(donnerForce());
        guerrier1.setArme(donnerArme());
        guerrier1.setBouclier(donnerBouclier());
        return guerrier1;
    }

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

    public static String donnerArme() {
        System.out.println("Donnez-lui une arme");
        String arme = sc.nextLine();
        while (arme.equals("")) {
            System.out.println("Donnez-lui une arme");
            arme = sc.nextLine();
        }
        System.out.println("Il aura l'arme suivante " + arme);
        return arme;
    }

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

    public static int attaquer(Personnage z) {
        System.out.println("Vous souhaitez attaquer votre ennemi. Votre force est de " + z.getForce() +
         " saisissez une force d'attaque inférieure ou égale à " +  z.getForce());
        int frappe = sc.nextInt();
        sc.nextLine();
        System.out.println("Vous avez saisi " + frappe);
        int reste = z.getForce() - frappe;
        System.out.println("Il vous reste en force : " + reste);
        z.setForce(reste);
    return reste ;
    }

}








