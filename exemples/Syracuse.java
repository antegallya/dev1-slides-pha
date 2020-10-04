import java.util.Scanner;
/*
 *Si n est pair -> n / 2
 * Sinon -> 3 * n + 1
 * On s'arrête quand l'élément est 1
 * 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
 * (stop) 4, 2, 1, 4, 2, 1
 */
/* Aussi appelé conjecture de Collatz. */
public class Syracuse {
    public static void syracuse(int n) {
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int n = scan.nextInt();
        syracuse(n);
    }
}
