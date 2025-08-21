/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contoh1;

/**
 *
 * @author Ridho
 */
public class amfibi extends Hewan {

    /**
     * @return the WarnaKulit
     */
    protected String getWarnaKulit() {
        return WarnaKulit;
    }

    /**
     * @param WarnaKulit the WarnaKulit to set
     */
    protected void setWarnaKulit(String WarnaKulit) {
        this.WarnaKulit = WarnaKulit;
    }

    /**
     * @return the BerkembangBiak
     */
    protected String getBerkembangBiak() {

        return BerkembangBiak;
    }

    /**
     * @param BerkembangBiak the BerkembangBiak to set
     */
    protected void setBerkembangBiak(String BerkembangBiak) {
        this.BerkembangBiak = BerkembangBiak;
    }

    /**
     * @return the Habitat
     */
    protected String getHabitat() {

        return Habitat;
    }

    /**
     * @param Habitat the Habitat to set
     */
    protected void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    /**
     * @return the OrganUntukBernafas
     */
    private String BerkembangBiak;
    private String Habitat;
    private String WarnaKulit;
}
