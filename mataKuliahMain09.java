public class mataKuliahMain09 {
    public static void main(String[] args) {
        mataKuliah09 mk1 = new mataKuliah09();
        mk1.kodeMK = "ASD001";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(10);
        mk1.tampilInformasi();

        mataKuliah09 mk2 = new mataKuliah09("PASD002", "Praktikum Algoritma dan Struktur Data", 3,6);
        mk2.tampilInformasi();

        mk2.ubahSKS(5);
        mk2.tambahJam(1);
        mk2.kurangiJam(4);
    }
}
