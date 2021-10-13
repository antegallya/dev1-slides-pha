import java.util.Scanner;
import java.util.InputMismatchException;

public class TUIUtils {

    public static int promptInt(String prompt, int min, int max) {
        Scanner kbd = new Scanner(System.in);
        // init à 0 pour éviter "ret might not have been initialized".
        int ret = 0;
        boolean ok = false;

        do {
            // NetBeans bug: utiliser println au lieu de print.
            System.out.print(prompt);
            try {
                ret = kbd.nextInt();
                if (min <= ret && ret <= max) {
                    ok = true;
                    //return ret;
                } else {
                    System.out.println(
                            "Entrée invalide (" + min + " < " + max + ")");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrée invalide.");
            }
        } while (!ok);

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
