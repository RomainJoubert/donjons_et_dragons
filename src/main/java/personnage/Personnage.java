package personnage;


/**
 * The type Personnage.
 */
public class Personnage {
    private String nom;
    private String image;
    private int vie;
    private int force;


    public String toString() {
        return "Nom : " + nom + " \nImage : " + image + "\nVie : " + vie + "\nForce : " + force;
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Gets vie.
     *
     * @return the vie
     */
    public int getVie() {
        return vie;
    }

    /**
     * Sets vie.
     *
     * @param vie the vie
     */
    public void setVie(int vie) {
        this.vie = vie;
    }

    /**
     * Gets force.
     *
     * @return the force
     */
    public int getForce() {
        return force;
    }

    /**
     * Sets force.
     *
     * @param force the force
     */
    public void setForce(int force) {
        this.force = force;
    }


}
