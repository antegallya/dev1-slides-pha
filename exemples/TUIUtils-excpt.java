import java.util.Scanner;
import java.util.InputMismatchException;

public class TUIUtils {

    public static int promptInt(String prompt, int min, int max) {
        Scanner kbd = new Scanner(System.in);
        int ret;
        boolean ok = false;
        while (!ok) {
            System.out.print(prompt);
            try {
                ret = kbd.nextInt();
                if (min <= ret && ret <= max) {
                    return ret;
                } else {
                    System.out.println(
                            "Entrée invalide (" + min + " < " + max + ")");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrée invalide.");
            }
        }
        return ret;
    }

    public static int promptInt(String prompt) {
        Scanner kbd = new Scanner(System.in);
        int ret;
        boolean ok = false;
        while (!ok) {
            System.out.print(prompt);
            try {
                ret = kbd.nextInt();
                ok = true;
            } catch (InputMismatchException e) {}
        }
        return ret;
    }

    public static String promptString(String prompt) {
        Scanner kbd = new Scanner(System.in);
        System.out.print(prompt);
        return kbd.nextLine();
    }
}
