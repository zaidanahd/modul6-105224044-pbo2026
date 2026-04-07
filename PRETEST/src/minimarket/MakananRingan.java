package minimarket;

public class MakananRingan extends Produk {
    private String rasa;

    // Konstruktor subclass menggunakan super()
    public MakananRingan(String namaProduk, double harga, String rasa) {
        super(namaProduk, harga);
        this.rasa = rasa;
    }

    // Override fungsi tampilkanDetail
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail(); // Memanggil fungsi milik parent
        System.out.println("Rasa        : " + rasa);
    }
}

