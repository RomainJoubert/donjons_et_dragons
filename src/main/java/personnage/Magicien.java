package personnage;

import java.util.Scanner;

public class Magicien extends Personnage {
    String sort;
    String philtre;

    public void addPower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez-lui un sort");
        sort = sc.nextLine();
        while (sort.equals("")) {
            System.out.println("Donnez-lui un sort");
            sort = sc.nextLine();
        }
        System.out.println("Il aura le sort suivant " + sort);
        System.out.println("Donnez-lui un philtre pour se protéger");
        philtre = sc.nextLine();
        while (philtre.equals("")) {
            System.out.println("Donnez-lui un philtre pour se protéger");
            philtre = sc.nextLine();
        }
        System.out.println("Il aura la protection suivante " + philtre);
    }

    public String toString() {
        return super.toString()+"\nSort : " + sort + "\nPhiltre : " + philtre;
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
}