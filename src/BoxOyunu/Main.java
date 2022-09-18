package BoxOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter semih = new Fighter("Semih", 15, 100, 90, 50);
        Fighter enes = new Fighter("Enes", 10, 95, 100, 50);
        Ring r = new Ring(semih, enes, 90, 100);
        r.run();
    }

}
