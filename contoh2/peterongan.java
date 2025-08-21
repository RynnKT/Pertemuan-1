/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contoh2;

/**
 *
 * @author Ridho
 */
public class peterongan extends jombang {

    /**
     * @return the luasKecamatan
     */
    protected String getLuasKecamatan() {
        return luasKecamatan;
    }

    /**
     * @param luasKecamatan the luasKecamatan to set
     */
    protected void setLuasKecamatan(String luasKecamatan) {
        this.luasKecamatan = luasKecamatan;
    }

    /**
     * @return the namaKecamatan
     */

    /**
     * @return the jumlahDesa
     */
    protected int getJumlahDesa() {
        return jumlahDesa;
    }

    /**
     * @param jumlahDesa the jumlahDesa to set
     */
    protected void setJumlahDesa(int jumlahDesa) {
        this.jumlahDesa = jumlahDesa;
    }

    /**
     * @return the jumlahPenduduk
     */
    protected String getJumlahPenduduk() {
        return jumlahPenduduk;
    }

    /**
     * @param jumlahPenduduk the jumlahPenduduk to set
     */
    protected void setJumlahPenduduk(String jumlahPenduduk) {
        this.jumlahPenduduk = jumlahPenduduk;
    }

   
    private int jumlahDesa;
    private String jumlahPenduduk;
    private String luasKecamatan;

    public static void main(String[] args) {
        peterongan kabupaten = new peterongan();

        kabupaten.setJumlahKabupaten(29);
        kabupaten.setLuasWilayahProvinsi("47.803,49km2");
        kabupaten.setJumlahKota(9);

        kabupaten.setJumlahKecamatan(21);
        kabupaten.setLuasWilayahKota("1.159,50km2");
        
        kabupaten.setJumlahDesa(15);
        kabupaten.setJumlahPenduduk("70.502 jiwa");
        kabupaten.setLuasKecamatan("29,47km");

        System.out.println("Nama Kecamatan = Peterongan");
        System.out.println("\ninformasi dari JawaTimur");
        System.out.println("Jumlah Kabupaten = " + kabupaten.getJumlahKabupaten());
        System.out.println("Jumlah kota = " + kabupaten.getJumlahKota());
        System.out.println("Luas Provinsi JawaTImur = " + kabupaten.getLuasWilayahProvinsi());

        System.out.println("\ninformasi dari Jombang");
        System.out.println("Jumlah kecamatan = " + kabupaten.getJumlahKecamatan());
        System.out.println("Luas Kota jombang = " + kabupaten.getLuasWilayahKota());
        
        System.out.println("\ninformasi dari Peterongan");
        System.out.println("Jumlah desa = "+ kabupaten.getJumlahDesa());
        System.out.println("Jumlah Penduduk = "+ kabupaten.getJumlahPenduduk());
        System.out.println("Luas kecamatan = "+ kabupaten.getLuasKecamatan());

    }
}
