import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions {

    /**
     * lablalba
     * @throws IllegalArgumentException when the string doesn't represent a
     * binary number. */
    public static int binaryToInt(String str) {
        int ret = 0;
        int power = 1;
        for (int i = 0; i < str.length(); ++i) {
            // Here, power = 2^i.
            switch (str.charAt(str.length() - 1 - i)) {
                case '0':
                    break;
                case '1':
                    ret += power;
                    break;
                default:
                    throw new IllegalArgumentException("Not a binary string.");
            }
            power *= 2;
        }
        return ret;
    }

    public static double parseFraction(String s) {
        int num, denom;
        int sIndex = s.indexOf('/');
        num = Integer.parseInt(s.substring(0, sIndex));
        denom = Integer.parseInt(s.substring(sIndex + 1, s.length()));
        return ((double) num) / denom;
    }

    public static void main(String[] args) {
        String str = TUIUtils.promptString("Entrez une fraction : ");
        try {
//            System.out.println(binaryToInt(str));
            System.out.println(parseFraction(str));
        }
        catch (IllegalArgumentException e) {
            ///
        }
    }
}
