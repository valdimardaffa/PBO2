package UTS_oop2;

public class HargaSuite implements HargaStrategy {
    private static final double HARGA_PER_MALAM = 1200000;
 
    @Override
    public double hitungHarga(int jumlahMalam) {
        double total = HARGA_PER_MALAM * jumlahMalam;
        return total;
    }
 
    @Override
    public String getNamaStrategi() {
        return "Kamar Suite";
    }
}
