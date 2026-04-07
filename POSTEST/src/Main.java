import rental.Kendaraan;
import rental.Mobil;
import rental.Motor;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kendaraan> daftarRental = new ArrayList<>();

        // 1. Mobil lama (< 2015), kapasitas > 5
        daftarRental.add(new Mobil("B 1234 OLD", "Toyota Avanza", 2012, 300000, 7));

        // 2. Mobil baru (>= 2015), kapasitas <= 5
        daftarRental.add(new Mobil("B 5678 NEW", "Honda City", 2022, 500000, 5));

        // 3. Motor gede (>= 250 CC)
        daftarRental.add(new Motor("B 9999 MGE", "Kawasaki Ninja", 2020, 150000, 250));

        // 4. Motor standar (< 250 CC)
        daftarRental.add(new Motor("B 4444 STD", "Honda Vario", 2019, 75000, 150));

        System.out.println("=== SISTEM PENDATAAN RENTAL KENDARAAN ===\n");

        for (Kendaraan k : daftarRental) {
            k.displayInfo();
            double totalSewa = k.hitungHargaSewa(5);
            System.out.println("Total Biaya Sewa selama 5 Hari: Rp" + String.format("%.0f", totalSewa));
            System.out.println("------------------------------------------");
        }
    }
}
