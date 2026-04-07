package rental;

public class Mobil extends Kendaraan {
    private int kapasitasPenumpang;

    public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas     : " + kapasitasPenumpang + " orang");
    }

    @Override
    public double hitungHargaSewa(int hari) {
        // Harga dasar (termasuk diskon tahun jika ada) + asuransi 50rb/hari
        double total = super.hitungHargaSewa(hari) + (50000 * hari);
        
        // Biaya kebersihan flat jika > 5 orang
        if (kapasitasPenumpang > 5) {
            total += 50000;
        }
        return total;
    }
}
