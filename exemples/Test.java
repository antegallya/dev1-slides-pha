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

    public static void display(int[] a) {
        for(int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void reverseSign(int[] a) {
        for(int i = 0; i < a.length; ++i) {
            a[i] = -a[i];
        }
    }

    public static void testC(String s) {
        s = "Hello";
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        a[0] = 4;
        a[1] = 21;
        a[2] = 42;
        display(a);
        display(b);
        a = new int[] {1, 2, 3};
        display(a);
        display(b);

        a[1] = 84;
        a[1]++;
        display(a);
        reverseSign(a);
        display(a);
        System.out.println(a.length);
        System.out.println("Hello".length());
        String myString = "Truc";
        testC(myString);
        System.out.println(myString);

        String[] strings = new String[3];
        String s = "Hello";
        String s2 = "Truc";
        strings[0] = s;
        strings[1] = s2;
        strings[2] = s;

        //System.out.println(strings[0] == strings[2]);
        //int array[];
        //System.out.println(array[2]);
        //String strings2[] = new String[5];
        //System.out.println(strings2[2].toUpperCase());
        //
        //int[] c;
        //System.out.println(c.length);
    }
}
