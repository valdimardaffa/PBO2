package UTS_oop2;

public class HargaDeluxe implements HargaStrategy {
    private static final double HARGA_PER_MALAM = 650000;

    @Override
    public double hitungHarga(int jumlahMalam) {
        return HARGA_PER_MALAM * jumlahMalam;
    }

    @Override
    public String getNamaStrategi() {
        return "Kamar Deluxe";
    }
}