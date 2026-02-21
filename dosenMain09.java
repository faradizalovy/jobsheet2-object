public class dosenMain09 {
    public static void main(String[] args) {
        dosen09 d1 = new dosen09();
        d1.idDosen = "D001";
        d1.nama = "Nanang Wijaya";
        d1.statusAktif = true;
        d1.tahunBergabung = 2017;
        d1.bidangKeahlian = "Struktur Data";
        
        d1.tampilInformasi();
        d1.hitungMasaKerja(2026);

        d1.setStatusAktif(false);
        d1.ubahKeahlian("Dasar Pemrograman");

        System.out.println("Data Dosen Sekarang:");
        d1.tampilInformasi();

        dosen09 d2 = new dosen09("D002", "Andi Dwi", true, 2018, "Basis Data");
        d2.tampilInformasi();
        d2.hitungMasaKerja(2026);

        d2.setStatusAktif(true);
        d2.ubahKeahlian("Sistem Operasi");
        System.out.println("Data Dosen Sekarang:");
        d2.tampilInformasi();
    }
}
