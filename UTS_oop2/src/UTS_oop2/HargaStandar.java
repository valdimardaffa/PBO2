package UTS_oop2;

public class HargaStandar implements HargaStrategy {
    private static final double HARGA_PER_MALAM = 350000;

    @Override
    public double hitungHarga(int jumlahMalam) {
        return HARGA_PER_MALAM * jumlahMalam;
    }

    @Override
    public String getNamaStrategi() {
        return "Kamar Standar";
    }
}
