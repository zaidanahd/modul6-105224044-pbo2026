package perusahaan;

public class Manajer extends Karyawan {
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, 
                   double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    @Override
    public double hitungGajiTotal() {
        double gajiBase = super.hitungGajiTotal();
        
        // Tunjangan Manajerial: 300rb per anggota
        double tunjanganManajer = jumlahAnggotaTim * 300000;
        double totalSementara = gajiBase + tunjanganManajer;

        // Bonus Kinerja Ekstra kalo manajernya jago(rating > 4.5) tambah 15% 
        if (getRatingKinerja() > 4.5) {
            totalSementara += (0.15 * totalSementara);
        }
        
        return totalSementara;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Divisi: " + divisi + " | Tim: " + jumlahAnggotaTim + " orang");
    }
}
