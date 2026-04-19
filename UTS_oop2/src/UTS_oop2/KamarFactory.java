package UTS_oop2;

public class KamarFactory {

    public static HargaStrategy create(String jenis) {
        switch (jenis.toLowerCase()) {
            case "standar":
                return new HargaStandar();
            case "deluxe":
                return new HargaDeluxe();
            case "suite":
                return new HargaSuite();
            default:
                throw new IllegalArgumentException("Jenis kamar tidak dikenal: " + jenis);
        }
    }
}
