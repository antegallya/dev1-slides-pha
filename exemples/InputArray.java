import java.util.Scanner;

public class InputArray {
    public static void display(int[] array, int size) {
        System.out.print("[");
        /*
        for (int i = 0; i < cpt; ++i) {
            System.out.print(array[i]);
            if (i != cpt - 1) {
                System.out.print(", ");
            }
        }
        */
        for(int i = 0; i < size - 1; ++i) {
            System.out.print(array[i] + ", ");
        }
        if (size > 0) {
            System.out.print(array[size - 1]);
        }
        System.out.println("]");
    }

    public static void copyTo(int[] src, int[] dst) {
        // ! Je suppose ici que dst.length >= src.length
        // sinon: lancer une exception ?
        for (int i = 0; i < src.length; ++i) {
            dst[i] = src[i];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0;
        int[] array = new int[2];
        while (scan.hasNextInt()) {
            if (size >= array.length) {
                int[] new_array = new int[size * 2];
                copyTo(array, new_array);
                array = new_array;
                //array = Arrays.copyOf(array, size * 2);
            }
            int value = scan.nextInt();
            array[size] = value;
            ++size;
        }

        //System.out.println(Arrays.toString(array));
        display(array, size);
    }
}
