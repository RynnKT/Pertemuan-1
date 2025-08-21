/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contoh3;

/**
 *
 * @author Ridho
 */
public class SupraX125FI extends motor {

    /**
     * @return the merk
     */
    protected String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    protected void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * @return the model
     */
    protected String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    protected void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the KapasitasTangki
     */
    protected String getKapasitasTangki() {
        return KapasitasTangki;
    }

    /**
     * @param KapasitasTangki the KapasitasTangki to set
     */
    protected void setKapasitasTangki(String KapasitasTangki) {
        this.KapasitasTangki = KapasitasTangki;
    }

    /**
     * @return the KonsumsiBBM
     */
    
    private String merk;
    private String model;
    private String KapasitasTangki;
   
    
    public static void main(String[] args) {
        SupraX125FI darat = new SupraX125FI();
        
        darat.setJenisKendaraan("darat");
        darat.setBahanBakar("bensin");
        darat.setPenggerak("ban karet");
        
        darat.setTipeTransmisi("manual");
        darat.setJumlahRoda(2);
        darat.setTahunMotor(2025);
        
        darat.setMerk("honda");
        darat.setModel("Supra X 125 FI");
        darat.setKapasitasTangki("4.0//liter");
        
        
        System.out.println("kendaraannya = Supra X 125 FI");
        System.out.println("\ninformasi dari Kendaraan");
        System.out.println("Jenis Kendaraannya = " + darat.getJenisKendaraan());
        System.out.println("Bahan Bakarnya = " + darat.getBahanBakar());
        System.out.println("Penggerak kendaraan = " + darat.getPenggerak());
        
        System.out.println("\ninformasi dari motor");
        System.out.println("Tipe Tranmisinya = " + darat.getTipeTransmisi());
        System.out.println("Jumlah Rodanya = " + darat.getJumlahRoda());
        System.out.println("Tahun Motornya = " + darat.getTahunMotor());
        
        System.out.println("\ninformasi dari Supra X 125 FI");
        System.out.println("Merk motornya = " + darat.getMerk());
        System.out.println("Model Motornya = " + darat.getModel());
        System.out.println("Kapasitas Tangkinya = " + darat.getKapasitasTangki());
        
    }
}
