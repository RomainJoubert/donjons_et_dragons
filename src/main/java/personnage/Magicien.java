package personnage;

public class Magicien extends Personnage {

    private String sort;
    private String philtre;


    public String toString() {
        return super.toString() + "\nSort : " + sort + "\nPhiltre : " + philtre;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getPhiltre() {
        return philtre;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }


    //        System.out.println("Vous souhaitez modifier le sort : 5 ; le philtre : 6");
    //          sc.nextLine();
    //        if (choix == 5) {
    //            System.out.println("Vous souhaitez modfier le sort de votre personnage ");
//    public void modification() {
//            String nouveauSort = sc.nextLine();
//            System.out.println("Voici son nouveau sort " + nouveauSort);
//        } else if (choix == 6) {
//            System.out.println("Vous souhaitez modfier le philtre de votre personnage ");
//            String nouveauPhiltre = sc.nextLine();
//            System.out.println("Voici son nouveau philtre " + nouveauPhiltre);
//        }
//    }
}