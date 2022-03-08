package isd;

public class ATK <ATK> implements Comparable <ATK>{
    private String kodeBarang, jenisBarang, namaBarang;
    private int stok;

    public ATK(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
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
        return "ATK{" +
                "kodeBarang='" + kodeBarang + '\'' +
                ", jenisBarang='" + jenisBarang + '\'' +
                ", namaBarang='" + namaBarang + '\'' +
                ", stok=" + stok +
                '}';
    }


    @Override
    public int compareTo(ATK o) {
        if (kodeBarang.equals(kodeBarang)) {
            return 0;
        } else {
            return 1;
        }
    }
}

