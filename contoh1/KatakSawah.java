/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contoh1;

/**
 *
 * @author Ridho
 */
public class KatakSawah extends amfibi {

    /**
     * @return the Suara
     */
    protected String getSuara() {
        return Suara;
    }

    /**
     * @param Suara the Suara to set
     */
    protected void setSuara(String Suara) {
        this.Suara = Suara;
    }

    private String Suara;

    public static void main(String[] args) {
        KatakSawah katak = new KatakSawah();

        katak.setBernafas("paru-paru dan insang");
        katak.setMakan("serangga");

        katak.setBerkembangBiak("bertelur");
        katak.setHabitat("tempat lembab");
        katak.setWarnaKulit("warna gelap");

        katak.setSuara("krok krok");

        System.out.println("hewan yang dipilih = katak sawah");
        System.out.println("\ninformasi dari hewan");
        System.out.println("bernafas menggunakan = " + katak.getBernafas());
        System.out.println("memakan = " + katak.getMakan());

        System.out.println("\ninformasi dari amfibi");
        System.out.println("Berkembangbiak dengan cara = " + katak.getBerkembangBiak());
        System.out.println("Habitat hidupnya = " + katak.getHabitat());
        System.out.println("Warna kulitnya = " + katak.getWarnaKulit());

        System.out.println("\nInformasi dari katak");
        System.out.println("Suara Katak Sawah = " + katak.getSuara());

    }
}
