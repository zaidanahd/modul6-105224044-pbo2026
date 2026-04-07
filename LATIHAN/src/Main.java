import game.Hero;
import game.HeroStrength;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Arjuna", 100, 30);
        HeroStrength hero2 = new HeroStrength("Bima", 150, 40);

        System.out.println("=== STATUS AWAL HERO ===");
        hero1.display();
        System.out.println();
        hero2.display();
        System.out.println();

        System.out.println("=== SESI LATIHAN ===");
        hero1.berlatih();
        hero2.berlatih();
        System.out.println();

        System.out.println("=== SIMULASI SERANGAN (Damage: 50) ===");
        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);
        System.out.println();

        System.out.println("=== STATUS AKHIR HERO ===");
        hero1.display();
        System.out.println();
        hero2.display();
    }
}
