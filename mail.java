package org.example;

public class Main {
    public static void main(String[] args) {
        Personel personel = new Personel("Meliha", "İpek", 10000);
        for (int i = 0; i < 30; i++) {
        }
        personel.calismaGunEkle(5);
        double maas = personel.maasHesapla(1000);
        System.out.println("Personelin maaşı: " + maas + "TL");
    }
}
