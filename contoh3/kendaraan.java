/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contoh3;

/**
 *
 * @author Ridho
 */
public class kendaraan {

    /**
     * @return the JenisKendaraan
     */
    protected String getJenisKendaraan() {
        return JenisKendaraan;
    }

    /**
     * @param JenisKendaraan the JenisKendaraan to set
     */
    protected void setJenisKendaraan(String JenisKendaraan) {
        this.JenisKendaraan = JenisKendaraan;
    }

    /**
     * @return the BahanBakar
     */
    protected String getBahanBakar() {
        return BahanBakar;
    }

    /**
     * @param BahanBakar the BahanBakar to set
     */
    protected void setBahanBakar(String BahanBakar) {
        this.BahanBakar = BahanBakar;
    }

    /**
     * @return the Penggerak
     */
    protected String getPenggerak() {
        return Penggerak;
    }

    /**
     * @param Penggerak the Penggerak to set
     */
    protected void setPenggerak(String Penggerak) {
        this.Penggerak = Penggerak;
    }
    
    private String JenisKendaraan;
    private String BahanBakar;
    private String Penggerak;
}
