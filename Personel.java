package org.example;

public class Personel {
    private String ad;
    private String soyad;
    private double maas;
    private int calismaGunSayisi;
    private double ekPrim;
    public Personel(String ad, String soyad, double maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.ekPrim = ekPrim;
        this.calismaGunSayisi = 0; //
    }
    public void calismaGunEkle(int calismaGunSayisi) {
        this.calismaGunSayisi += calismaGunSayisi;
    }
    public double maasHesapla(double ekPrim) {
        double toplamMaas = maas * calismaGunSayisi;
        if (calismaGunSayisi > 25) {
            int fazlaGunSayisi = calismaGunSayisi - 25;
            double fazlaPrim = fazlaGunSayisi * ekPrim;
            toplamMaas += fazlaPrim;
        }
        return toplamMaas;
    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public double getMaas() {
        return maas;
    }
    public int getCalismaGunSayisi() {
        return calismaGunSayisi;
    }
    public double getEkPrim(){
        return ekPrim;
    }
}
