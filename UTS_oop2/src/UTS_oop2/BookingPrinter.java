package UTS_oop2;

public class BookingPrinter {

    public void cetakStruk(Booking booking) {
        System.out.println("============================================");
        System.out.println("         STRUK BOOKING HOTEL MAMAT SELAMAT    ");
        System.out.println("============================================");
        System.out.printf("  Nama Guest    : %s%n", booking.getNamaGuest());
        System.out.printf("  Nomor Kamar   : %s%n", booking.getNomorKamar());
        System.out.printf("  Jenis Kamar   : %s%n", booking.getJenisKamar());
        System.out.printf("  Lama Menginap : %d malam%n", booking.getJumlahMalam());
        System.out.println("--------------------------------------------");
        System.out.printf("  Total Bayar   : Rp %,.0f%n", booking.getTotalHarga());
        System.out.println("============================================");
        System.out.println("  Terima kasih telah memilih Hotel kami!    ");
        System.out.println("============================================");
    }
}
