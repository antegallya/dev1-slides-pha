import java.util.Scanner;

public class InputNumbers {
    public static int sum() {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Entrez le nombre de nombre à lire : ");
        while (!kbd.hasNextInt()) {
            String token = kbd.next();
            System.out.println("Entrée invalide ! (" + token + ")");
            System.out.println("Entrez le nombre de nombre à lire : ");
        }

        int n = kbd.nextInt();

        // On pourrait 
        //int n = MyModule.askInt("Entrez un nombre :");

        System.out.println("Entrez vos " + n + " nombres.");
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            System.out.println("Entrez un nombre : ");
            int value = kbd.nextInt();
            sum += value;
            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }
        kbd.close();
        System.out.println(sum + " " + min + " " + max);
        return sum;
    }

    public static void main(String[] args) {
        int mySum = sum();
        System.out.println("La somme des éléments est " + mySum);
    }
}
