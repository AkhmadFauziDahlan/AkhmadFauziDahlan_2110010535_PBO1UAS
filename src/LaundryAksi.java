import java.sql.SQLOutput;

public class LaundryAksi {
    public static void main(String[] args) {
        Laundry express = new Laundry();
        express.namapelanggan = "Bowo";
        express.berat = 6;
        express.harga = 7000;
        express.waktu = 7;

        System.out.println("==================LAUDRY ASEKKKK==================");
        System.out.println("Setiap lebih dari 8kg akan mendapatkan Diskon 2000");
        System.out.println("==================================================");
        System.out.println("1. Nama Pelangan    : " + express.namapelanggan);
        System.out.println("   Berat Pakaian    : "+ express.berat + " Kg");
        System.out.println("   Harga            : Rp " + express.harga);
        System.out.println("   Waktu Pengerjaan : " + express.waktu + " Jam");
        System.out.println("==================================================");

            Laundry biasa = new Laundry();
            biasa.namapelanggan = "aa ";
            biasa.berat = 2;
            biasa.harga = 3000;
            biasa.waktu = 3;
            System.out.println("==================LAUDRY ASEKKKK==================");
            System.out.println("Setiap lebih dari 8kg akan mendapatkan Diskon 2000");
            System.out.println("==================================================");
            System.out.println("2. Nama Pelangan    : " + biasa.namapelanggan);
            System.out.println("   Berat Pakaian    : "+ biasa.berat + " Kg");
            System.out.println("   Harga            : Rp " + biasa.harga);
            System.out.println("   Waktu Pengerjaan : " + biasa.waktu + " Hari");
            System.out.println("==================================================");

        biasa.mendapatkanDiskon();
        System.out.println("Total Mencuci 2 pakaian : " +(express.harga + biasa.harga));
    }
}