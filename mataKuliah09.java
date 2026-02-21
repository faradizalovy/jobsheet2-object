public class mataKuliah09 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public mataKuliah09() { 
    }

    public mataKuliah09(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK   : " +kodeMK);
        System.out.println("Nama      :" +nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
        System.out.println("==============================");
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " +sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan.");
        }
    }
}
