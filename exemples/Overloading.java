public class Overloading {
    public static int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static double max(double a, double b) {
        if (a > b)
            return a;
        return b;
    }

    public static double max(double a, double b, double c) {
        return max(max(a, b), c);
    }

    /*
    public static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0)
            return a;
        else
            return b;
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        return max(max(a, b), c);
    }*/

    /*
    @SafeVarargs
    public static <T extends Comparable<T>> T max(T arg0, T... args) {
        //int currentMax = Integer.MIN_VALUE;
        T currentMax = arg0;
        for (T arg : args) {
            if (arg.compareTo(currentMax) > 0) {
                currentMax = arg;
            }
        }
        return currentMax;
    }*/

    public static void main(String[] args) {
        //System.out.println(max());
        //System.out.println(max(42));
        System.out.println(max(42, 21));
        System.out.println(max(42, 21, 84));
        System.out.println(max(42.1, 21.21));
        System.out.println(max(42.1, 21.21, 84.42));
    }
}
