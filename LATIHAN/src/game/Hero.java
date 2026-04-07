package game;

public class Hero {
    protected String nama;
    protected double health;
    protected double attackPower;

    public Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("--- Status Hero ---");
        System.out.println("Nama         : " + nama);
        System.out.println("Health       : " + health);
        System.out.println("Attack Power : " + attackPower);
    }

    public void berlatih() {
        this.attackPower += 10;
        System.out.println(nama + " sedang berlatih... (Attack Power +10)");
    }

    public void terimaSerangan(double damage) {
        this.health -= damage;
        System.out.println(nama + " menerima serangan sebesar " + damage + " damage!");
    }
}
