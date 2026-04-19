package UTS_oop2;

public class Booking {
    private String namaGuest;
    private String nomorKamar;
    private int jumlahMalam;
    private HargaStrategy hargaStrategy;

    public Booking(String namaGuest, String nomorKamar, int jumlahMalam, HargaStrategy hargaStrategy) {
        this.namaGuest = namaGuest;
        this.nomorKamar = nomorKamar;
        this.jumlahMalam = jumlahMalam;
        this.hargaStrategy = hargaStrategy;
    }

    public String getNamaGuest()    { return namaGuest; }
    public String getNomorKamar()   { return nomorKamar; }
    public int getJumlahMalam()     { return jumlahMalam; }
    public double getTotalHarga()   { return hargaStrategy.hitungHarga(jumlahMalam); }
    public String getJenisKamar()   { return hargaStrategy.getNamaStrategi(); }
}