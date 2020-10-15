public class Types {
    public static void printBinary(double d) {
        System.out.println(d + " : " +
                Long.toBinaryString(Double.doubleToRawLongBits(d)));
    }
    public static void printBinary(int i) {
        System.out.println(i + " : " + Integer.toBinaryString(i));
    }
    public static void printBinary(String s) {
        System.out.print(s + " : ");
        for (byte b : s.getBytes()) {
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBinary(42);
        printBinary(-1);
        printBinary(2.5);
        printBinary(0.1);
        printBinary(0.3);
        printBinary(0.5);
        printBinary(Math.PI);
        printBinary("Hello");
        System.out.println(010 + 1);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(42.);
        System.out.println(42e-10);
        System.out.println(42.21e-10);
        System.out.println(0x2A);
    }
}
