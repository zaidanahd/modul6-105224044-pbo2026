import perusahaan.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();

        // Input 5 Objek sesuai instruksi
        listKaryawan.add(new Karyawan("KYN1", "Andi", 2020, 5000000, 2.0)); // Penalti
        listKaryawan.add(new Developer("DVLP1", "Budi", 2018, 8000000, 4.0, "Senior", 20)); // Bonus Max
        listKaryawan.add(new Developer("DVLP2", "Citra", 2024, 6000000, 2.8, "Mid", 15)); // Bonus Bug Hangus
        listKaryawan.add(new Manajer("MNJR1", "Deni", 2015, 12000000, 4.8, "IT", 10)); // Bonus 15%
        listKaryawan.add(new Manajer("MNJR2", "Euis", 2025, 10000000, 3.5, "HR", 3)); // Normal

        double totalAnggaran = 0;
        double totalRating = 0;
        Karyawan highestEarner = listKaryawan.get(0);

        System.out.println("=== DATA KARYAWAN PERUSAHAAN A ===");
        for (Karyawan k : listKaryawan) {
            double gajiBulanIni = k.hitungGajiTotal();
            k.displayInfo();
            System.out.println("Total Gaji Bulan Ini: Rp" + String.format("%.2f", gajiBulanIni));
            System.out.println("--------------------------------------------------");

            // Akumulasi anggaran dan rating
            totalAnggaran += gajiBulanIni;
            totalRating += k.getRatingKinerja();

            // Cek gaji tertinggi
            if (gajiBulanIni > highestEarner.hitungGajiTotal()) {
                highestEarner = k;
            }
        }

        // Output statistik akhir
        System.out.println("Total Anggaran Gaji Perusahaan: Rp" + String.format("%.2f", totalAnggaran));
        System.out.println("Highest Earner: " + highestEarner.getNama());
        System.out.println("Rata-rata Rating Kinerja: " + (totalRating / listKaryawan.size()));
    }
}
