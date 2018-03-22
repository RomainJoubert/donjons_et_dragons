package personnage;

public class Guerrier extends Personnage {

    private String arme;
    private String bouclier;

    public String toString() {
        return super.toString() + "\nArme : " + arme + "\nBouclier : " + bouclier;
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
