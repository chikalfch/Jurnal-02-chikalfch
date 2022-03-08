package isd;

public class Main {
 public static void main(String[] args) {
     TokoABC toko = new TokoABC();

     ATK pensil = new ATK("A001", "Pensil", "Pensil Faber Castell", 6);
     ATK pulpen = new ATK("A002", "Pulpen", "Pulpen Snowman", 6);
     ATK kertasHvs = new ATK("B001", "Kertas HVS", "Kertas HVS Sinar Dunia", 6);
     ATK kertasKarton = new ATK("B002", "Kertas Karton", "Kertas Karton Hitam", 6);
     ATK bukuTulis = new ATK("B003", "Buku Tulis A5", "Buku Tulis Campus", 6);

     Bag tas = new Bag("C001", "Tas Sekolah", "Tas Nevada",5);
     Bag serutan = new Bag("C002", "Serutan", "Serutan Joyko",5);
     Bag tempatPensil = new Bag("C003", "Tempat Pensil", "Tempat Pensil Warcar",5);
     Bag jangka = new Bag("C004", "Jangka", "Jangka Wippo",5);
     Bag penggaris = new Bag("C005", "Penggaris", "Penggaris 30 cm Carrier",5);

     toko.addATK(pensil);
     toko.addATK(pulpen);
     toko.addATK(kertasHvs);
     toko.addATK(kertasKarton);
     toko.addATK(bukuTulis);


     toko.addBag(tas);
     toko.addBag(serutan);
     toko.addBag(tempatPensil);
     toko.addBag(jangka);
     toko.addBag(penggaris);

     toko.displayATK();
     toko.displayBag();

 }
}
