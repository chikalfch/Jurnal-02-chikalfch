package isd;

public class Bag <Bag> implements Comparable <Bag> {
    private String kodeBarang, jenisBarang, namaBarang;
    private int stok;

    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }
    public int getStok() {
        return stok;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "kodeBarang='" + kodeBarang + '\'' +
                ", jenisBarang='" + jenisBarang + '\'' +
                ", namaBarang='" + namaBarang + '\'' +
                ", stok=" + stok +
                '}';
    }

    @Override
    public int compareTo(Bag o) {
        if (kodeBarang.equals(kodeBarang)) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
