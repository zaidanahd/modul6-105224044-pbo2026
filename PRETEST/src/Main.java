import minimarket.MakananRingan;
public class Main {
    public static void main(String[] args) {
        MakananRingan snack = new MakananRingan("kue nastar", 25000, "asin");
        System.out.println("=== Detail Inventaris Barang ===");
        snack.tampilkanDetail();
    }
}