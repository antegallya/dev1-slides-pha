import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        // new Random(42); // Seed imposée
        // Seed choisie automatiquement.
        Random rnd = new Random(42);
        final int MAX = 13;
        System.out.println("Deux entiers entre 0 et " + MAX
                           + " (non compris)");
        System.out.println(rnd.nextInt(MAX));
        System.out.println(rnd.nextInt(MAX));
        System.out.println("Deux doubles entre 0 et 1 (non compris)");
        System.out.println(rnd.nextDouble());
        System.out.println(rnd.nextDouble());
    }
}
