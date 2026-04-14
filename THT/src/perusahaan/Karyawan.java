package perusahaan;

public class Karyawan {
    // Atribut dibuat private biar aman (Encapsulation)
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    // Konstruktor untuk ngolah objek yang kita buat
    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        
        // Validasi rating 1.0 - 5.0 dibuat agar user ga asal input di luar rangenya, tapi kalo melebihi maka di paksa jadi 3.0
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0; // Default jika tidak valid
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    public double hitungGajiTotal() {
        int tahunSekarang = 2026;
        int masaKerja = tahunSekarang - tahunMasuk;
        
        // Bonus Loyalitas: 5% dari gajiPokok per tahun masa kerja
        double bonusLoyalitas = (0.05 * gajiPokok) * masaKerja;
        double totalSementara = gajiPokok + bonusLoyalitas;

        // Penalti Kinerja: Potong 10% jika rating < 2.5
        if (ratingKinerja < 2.5) {
            totalSementara -= (0.10 * totalSementara);
        }
        return totalSementara;
    }

    public void displayInfo() {
        System.out.println("ID: " + idKaryawan + " | Nama: " + nama + " | Masuk: " + tahunMasuk + " | Rating: " + ratingKinerja + " | Gaji Pokok: Rp" + gajiPokok);
    }

    // Getter biar kelas lain bisa melihat nilai atribut private
    public String getNama(){ 
        return nama; 
    }
    public double getRatingKinerja(){ 
        return ratingKinerja; 
    }
}
