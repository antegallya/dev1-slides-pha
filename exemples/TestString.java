import java.util.Scanner;

public class TestString {

    public static int containsChar(String word, char letter) {
        letter = Character.toLowerCase(letter);
        for (int i = 0; i < word.length(); ++i) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c == letter) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isAt(String str, String sub, int at) {
        /*
        boolean subMatch = true;
        int j = 0;
        while (subMatch && j < sub.length()) {
            if (at + j >= str.length()
                    || sub.charAt(j) != str.charAt(at + j)) {
                // sub is not at index i of str.
                subMatch = false;
            }
            ++j;
        }
        return subMatch;
        */
        for (int i = 0; i < sub.length(); ++i) {
            if (at + i >= str.length()
                    || sub.charAt(i) != str.charAt(at + i)) {
                // sub is not at index at of str.
                return false;
            }
        }
        return true;
    }

    public static int find(String str, String sub) {
        for (int at = 0; at < str.length() - sub.length(); ++at) {
            if (isAt(str, sub, at)) {
                return at;
            }
        }
        return -1;
    }

    public static boolean containsString(String str, String sub) {
        return find(str, sub) >= 0;
        /*
        char firstSub = sub.charAt(0);
        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == firstSub) {
                boolean subMatch = true;
                int j = 1;
                while (subMatch && j < sub.length()) {
                    if (i + j >= str.length()
                            || sub.charAt(j) != str.charAt(i + j)) {
                        // sub is not at index i of str.
                        subMatch = false;
                    }
                    ++j;
                }
                if (subMatch) {
                    return true;
                }
            }
        }
        return false;
        */
    }

    public static String mirror(String str) {
        String ret = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            ret += str.charAt(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        /*Scanner kbd = new Scanner(System.in);
        String str = kbd.next();
        String sub = kbd.next();
        System.out.println("str: " + str + " sub: " + sub);
        System.out.println("str contains sub ?: " + containsString(str, sub));
        */
        System.out.println(mirror("algo"));
    }
}
