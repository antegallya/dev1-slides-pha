import java.util.Scanner;

public class TUIUtils {
    public static int promptInt(String prompt) {
        Scanner kbd = new Scanner(System.in);
        System.out.print(prompt);
        return kbd.nextInt();
    }

    public static String promptString(String prompt) {
        Scanner kbd = new Scanner(System.in);
        System.out.print(prompt);
        return kbd.nextLine();
    }
}
