import java.util.Scanner;
import java.text.Normalizer;

public class MyString {
    /* Faire un contains de juste un caractère */

    public static int indexOf(String src, char c, int start) {
        for (int i = start; start < src.length(); ++i) {
            if (c == src.charAt(i))
                return i;
        }
        return -1;
    }

    public static int indexOf(String src, char c) {
        return indexOf(src, c, 0);
    }

    public static boolean startsWith(String src, String sub, int fromIndex) {
        if (sub.length() > src.length())
            return false;
        for (int i = 0; i < sub.length(); ++i) {
            if (sub.charAt(i) != src.charAt(fromIndex + i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean startsWith(String src, String sub) {
        return startsWith(src, sub, 0);
    }

    public static int indexOf(String src, String sub) {
        for (int i = 0; i <= src.length() - sub.length(); ++i) {
            if (startsWith(src, sub, i))
                return i;
        }
        return -1;
    }

    public static boolean contains(String src, char c) {
        return indexOf(src, c) >= 0;
    }

    public static boolean contains(String src, String sub) {
        return indexOf(src, sub) >= 0;
    }

    public static boolean containsFirstTry(String src, String sub) {
        for (int i = 0; i <= src.length() - sub.length(); ++i) {
            /*
            int j;
            for (j = 0; j < sub.length(); ++j) {
                if (sub.charAt(i + j) != sub.charAt(j)) {
                    break; // only the inner loop
                }
            }
            if (j == sub.length()) {
                // Found the substring !
                return true;
            }
            */
            if (startsWith(src, sub, i))
                return true;
        }
        // If the executions reaches here,
        // the substring is not there...
        return false;
    }

    public static String mirror(String word) {
        String mirror = "";
        for (int i = 0; i < word.length(); ++i) {
            mirror = word.charAt(i) + mirror;
        }
        return mirror;
    }

    public static String mirrorSB(String word) {
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < word.length(); ++i){
            sb.setCharAt(word.length() - i - 1, word.charAt(i));
        }
        return sb.toString();
    }

    public static int letterIndex(char c) {
        c = Normalizer
              .normalize("" + c, Normalizer.Form.NFD)
              .replaceAll("[\u0300-\u036F]", "")
              .charAt(0);
        return Character.toLowerCase(c) - 'a' + 1;
    }

    public static void main(String[] args) {
        //String str = TUIUtils.promptString("Entrez une chaine : ");
        //String sub = TUIUtils.promptString("Entrez une (sous-?)chaine : ");
        System.out.println(letterIndex('é'));
        System.out.println(letterIndex('a'));
        System.out.println((char)('a' + 1));
        String s = "So long and thanks for all the fish!";
        System.out.println(s.substring(12, 26));
        //System.out.println(contains(str, sub));
    }
}
