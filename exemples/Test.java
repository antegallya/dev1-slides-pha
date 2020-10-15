public class Test {

    public static void count(int n) {
        int i = 1;
        // off-by-one
        // !(i <= n), i > n condition d'arrêt de la boucle.
        while (i <= n) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("i vaut " + i);
    }

    public static void countFor(int n) {
        for (int i = n; i > 0; --i) {
            System.out.println(i);
        }
        // i n'est pas dans le scope.
        System.out.println("i n'est pas déclarée ici");
    }

    public static void countEven() {
        int i = 2;
        int sum = 0;
        while (i <= 2000000000) {
            /*if (i % 2 == 0) {
                sum = sum + i;
            }*/
            sum = sum + i;
            i = i + 2;
        }
    }

    public static void countEvenFor() {
        for (int i = 2; i <= 10; i += 2 /* i = i + 2 */) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        countEvenFor();
        /*
        int i = 1;
        System.out.println(++i);
        System.out.println(i);*/
        String s = "Hello there !";
        System.out.println(s.substring(6,11));
        String s2 = "15/10/2020";
        int d = Integer.parseInt(s2.substring(0, 2));
        int m = Integer.parseInt(s2.substring(3, 5));
        int y = Integer.parseInt(s2.substring(6, 10));
        System.out.println(d + "-" + m + "-" + y);
    }
}
