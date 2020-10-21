import java.text.Normalizer;

public class StringTests {
    /**
     * Find the position of the given character c
     * in the string s.
     *
     * Gives -1 if c is not in s.
     * @param s the string in which we want to look for c
     * @parma c the character to look for in s
     * @return the index (starting from 0) of the first
     *         occurence of c in s.
     */
    public static int indexOf(String s, char c) {
        for (int i = 0; i < s.length(); ++i) {
            if (c == s.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(
            String word, char c) {
        return indexOf(word, c) != -1;
    }

    public static boolean startsWith(
            String src, String sub, int fromIndex) {
        // j is the index in sub.
        for (int j = 0; j < sub.length(); ++j) {
            if (sub.charAt(j) != src.charAt(fromIndex + j)) {
                // sub is not at index fromIndex of src.
                return false;
            }
        }
        return true;
    }

    public static boolean startsWith(String src, String sub) {
        return startsWith(src, sub, 0);
    }

    public static int indexOf(
            String src, String sub) {
        for (int i = 0; i <= src.length() - sub.length(); ++i) {
            // look for sub starting at i.
            if (startsWith(src, sub, i))
                return i;
        }
        return -1;
    }

    public static boolean contains(
            String src, String sub) {
        return indexOf(src, sub) != -1;
    }

    /*
    public static int indexOfString(
            String src, String sub) {
        // i is the index in src.
        for (int i = 0; i <= src.length() - sub.length(); ++i) {
            // This is a test
            //      is a
            int j;
            // j is the index in sub.
            //boolean ishere = true;
            for (j = 0; j < sub.length(); ++j) {
                if (sub.charAt(j) != src.charAt(i + j)) {
                    // sub is not a index i of src.
                    //ishere = false;
                    break;
                }
            }
            if (j == sub.length()) {
                // sub is at index i in src.
                return i;
            }
        }
        return -1;
    }*/


    /*
    public static boolean contains(
            String word, char c) {
        for (int i = 0; i < word.length(); ++i) {
            if (c == word.charAt(i))
                return true;
        }
        return false;
    }
    */

    /**
     * Reverses the given string.
     *
     * hop becomes poh.
     * @param src the string needed to be reversed.
     * @return the string src in reverse order.
     */
    public static String reverse(String src) {
        //String reversed = "";
        // "" + 'p' -> "p"
        // "p" + 'o' -> "po"
        // "po" + 'h' -> "poh"
        /*
        for (int i = src.length() - 1; i >= 0; --i) {
            reversed += src.charAt(i);
        }
        for (int i = 0; i < src.length(); i++) {
            reversed = reversed + src.charAt(src.length() - i - 1);
        }*/
        // h + "" -> "h"
        // o + "h" -> "oh"
        // p + "oh" -> "poh"
        /*for (int i = 0; i < src.length(); i++) {
            reversed = src.charAt(i) + reversed;
        }
        return reversed;*/
        StringBuilder sb = new StringBuilder(src);
        for (int i = 0; i < src.length(); ++i) {
            sb.setCharAt(src.length() - 1 - i, src.charAt(i));
        }
        return sb.toString();
    }

    public static int letterIndex(char c) {
        c = Normalizer
                .normalize(""+c, Normalizer.Form.NFD)
                .replaceAll("[\u0300-\u036F]", "")
                .charAt(0);
        return Character.toLowerCase(c) - 'a' + 1;
    }

    public static char indexToUpperChar(int idx) {
        if (idx <= 0 || idx > 26)
            return '?';
        return (char) ('A' + idx - 1);
    }

    public static void main(String[] args) {
        String str = TUIUtils.promptString(
                "Entrez une chaine de caractères : ");
        System.out.println(indexOf(str, 'a'));
        System.out.println(indexOf(str, "is a"));
        System.out.println(contains(str, 'a'));
        System.out.println(contains(str, "is a"));
        System.out.println(startsWith(str, "is a"));
        String b = "truc";
        // Concatenation
        System.out.println(str + b);
        int i = 42;
        System.out.println(" truc : " + i);
        System.out.println(reverse(str));
    }
}
