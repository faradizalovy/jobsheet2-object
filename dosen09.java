public class dosen09 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public dosen09() {
    }

    public dosen09(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.print("Status          :");
        if(statusAktif) {
            System.out.println("Aktif");
        } else {
            System.out.println("Tidak Aktif");
        }
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("=================================");
    }
    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.print("Mengubah status dosen menjadi: ");
        if (statusAktif) {
            System.out.println("Aktif");
        } else {
            System.out.println("Tidak Aktif");
        }
    }
    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Menghitung masa kerja: " + masaKerja + "tahun");
        return masaKerja;
    }
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi: " + bidangKeahlian);
    }
}
