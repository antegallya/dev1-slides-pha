import java.util.Scanner;

public class AreaTest {
    /* 
     * Calcule la surface d'un rectangle dont on donne la largeur et 
     * la longueur.
     * 
     * Les données ne sont pas négatives.
     */
    public static double rectangleArea(double length, double width){
        return length * width;
    }

    public static void main(String[] args){
        double length;
        double width;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Entre la longueur: ");
        length = keyboard.nextDouble();
        System.out.println("Entre la largeur: ");
        width = keyboard.nextDouble();

        System.out.println("Surface: " + rectangleArea(length, width));
    }
}
