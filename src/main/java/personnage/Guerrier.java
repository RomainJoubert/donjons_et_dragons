package personnage;

/**
 * The type Guerrier.
 */
public class Guerrier extends Personnage {

private String tableauArme[]= new String [5];
    private String bouclier;

    public String toString() {
        return super.toString() + "\nArme : " + toStringArme() + "\nBouclier : " + bouclier;
    }

    /**
     * Get tableau arme string [ ].
     *
     * @return the string [ ]
     */
    public String[] getTableauArme() {
        return tableauArme;
    }

    /**
     * Sets tableau arme.
     *
     * @param tableauArme the tableau arme
     */
    public void setTableauArme(String[] tableauArme) {
        this.tableauArme = tableauArme;
    }

    /**
     * Gets bouclier.
     *
     * @return the bouclier
     */
    public String getBouclier() {
        return bouclier;
    }

    /**
     * Sets bouclier.
     *
     * @param bouclier the bouclier
     */
    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    /**
     * To string arme string.
     *
     * @return the string
     */
//-----------------Permet de lire le tableau (sinon il nous afficherait l'objet---------------------------
    public String toStringArme(){
        String weapon = "";
        for (int i=0; i < tableauArme.length; i++) {
            if (tableauArme[i] != null) {
                weapon = weapon + " \nn° " + i +" : " + tableauArme[i];
            }
        }
        return weapon;
    }
}
