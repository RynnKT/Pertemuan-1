/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contoh3;

/**
 *
 * @author Ridho
 */
public class motor extends kendaraan {

    /**
     * @return the TipeTransmisi
     */
    protected String getTipeTransmisi() {
        return TipeTransmisi;
    }

    /**
     * @param TipeTransmisi the TipeTransmisi to set
     */
    protected void setTipeTransmisi(String TipeTransmisi) {
        this.TipeTransmisi = TipeTransmisi;
    }

    /**
     * @return the JumlahRoda
     */
    protected int getJumlahRoda() {
        return JumlahRoda;
    }

    /**
     * @param JumlahRoda the JumlahRoda to set
     */
    protected void setJumlahRoda(int JumlahRoda) {
        this.JumlahRoda = JumlahRoda;
    }

    /**
     * @return the TahunMotor
     */
    protected int getTahunMotor() {
        return TahunMotor;
    }

    /**
     * @param TahunMotor the TahunMotor to set
     */
    protected void setTahunMotor(int TahunMotor) {
        this.TahunMotor = TahunMotor;
    }
    private String TipeTransmisi;
    private int JumlahRoda;
    private int TahunMotor;
}
