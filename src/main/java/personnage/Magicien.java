package personnage;

/**
 * The type Magicien.
 */
public class Magicien extends Personnage {

    private String sort;
    private String philtre;


    public String toString() {
        return super.toString() + "\nSort : " + sort + "\nPhiltre : " + philtre;
    }

    /**
     * Gets sort.
     *
     * @return the sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * Sets sort.
     *
     * @param sort the sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Gets philtre.
     *
     * @return the philtre
     */
    public String getPhiltre() {
        return philtre;
    }

    /**
     * Sets philtre.
     *
     * @param philtre the philtre
     */
    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }

}