package UTS_oop2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("      SISTEM BOOKING HOTEL MAMAT SELAMAT     ");
        System.out.println("============================================");
        System.out.println("Jenis Kamar yang Tersedia:");
        System.out.println("  1. Standar  - Rp 350.000/malam");
        System.out.println("  2. Deluxe   - Rp 650.000/malam");
        System.out.println("  3. Suite    - Rp 1.200.000/malam");
        System.out.println("============================================");

        System.out.print("Masukkan Nama Tamu       : ");
        String namaGuest = scanner.nextLine();

        System.out.print("Masukkan Nomor Kamar     : ");
        String nomorKamar = scanner.nextLine();

        System.out.print("Masukkan Jenis Kamar     : ");
        String jenisKamar = scanner.nextLine();

        System.out.print("Masukkan Jumlah Malam    : ");
        int jumlahMalam = Integer.parseInt(scanner.nextLine());
        
   
        HargaStrategy strategy = KamarFactory.create(jenisKamar);

        
        Booking booking = new Booking(namaGuest, nomorKamar, jumlahMalam, strategy);

       
        BookingPrinter printer = new BookingPrinter();
        printer.cetakStruk(booking);

        scanner.close();
    }
}