package perusahaan;
// Developer itu juga Karyawan, jadi kita pakai 'extends' untuk menerapkan (Inheritance)
public class Developer extends Karyawan {
    private String level; // Junior, Mid, Senior
    private int jumlahBugFix;

    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, 
                     double ratingKinerja, String level, int jumlahBugFix) {
        //Panggil konstruktor parentnya (Karyawan) pakai super()
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    @Override
    public double hitungGajiTotal() {
        
        
        // Ambil dulu gaji dasar dari logika di kelas Karyawan
        double gajiBase = super.hitungGajiTotal();
        double tunjanganLevel = 0;

        // Tunjangan berdasarkan level
        if (level.equalsIgnoreCase("Mid")) tunjanganLevel = 1500000;
        else if (level.equalsIgnoreCase("Senior")) tunjanganLevel = 3000000;

        // Bonus Bug: 50rb per bug jika rating >= 3.0
        double bonusBug = 0;
        if (getRatingKinerja() >= 3.0) {
            bonusBug = jumlahBugFix * 50000;
        }

        return gajiBase + tunjanganLevel + bonusBug;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: " + level + " | Bug Fixed: " + jumlahBugFix);
    }
}
