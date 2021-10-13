public class Max3 {

    public static double max(double a, double b) {
        /*
        if (a > b)
            return a;
        else
            return b;
        */

        /*
        if (a > b)
            return a;

        return b;
        */
        return a > b ? a : b; // one-liner
    }

    public static double max(double a, double b, double c) {
        /*
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
        */
        /*
        if (max2(a, b) > c)
            return max2(a,b);
        return c;
        */
        double maxab = max(a,b);
        //a = 100;
        //System.out.println("a=" + a);
        return max(maxab, c);
        // return max2(max2(a, b), c);
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static String description(int a) {
        return "Entier " + a;
    }

    public static String description(double a) {
        return "Double " + a;
    }

    ///public static Numeric max(Numeric a, Numeric b, Numeric c) {...}

    public static void main(String[] args) {
        double a, b, c;
        a = 42;
        b = 84;
        c = 21;
        System.out.println((int) max(a, b, c));
        System.out.println(max(1, 2, 3));
        System.out.println(description(42));
        System.out.println(description(42.));
        //System.out.println(a + ", " + b + ", " + c);
        //System.out.printf("%d, %d, %d\n", a, b, c);
    }
}
