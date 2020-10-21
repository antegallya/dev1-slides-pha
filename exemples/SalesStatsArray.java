import java.util.Scanner;

public class SalesStatsArray {
    public static void statistics(){
        Scanner keyboard = new Scanner(System.in);
        int[] cpt = new int[10]; // Initialisé à 0, 0, 0, ...
        int productId;
        int quantity;
        System.out.print("Introduire le numéro de produit : ");
        productId = keyboard.nextInt();
        while (productId != -1){
            System.out.print("Quantité : ");
            quantity = keyboard.nextInt();

            cpt[productId] = cpt[productId] + quantity;

            System.out.print("Introduire le numéro de produit : ");
            productId = keyboard.nextInt();
        }

        for(int i = 0; i < cpt.length; i++){
            System.out.println(
                    "Quantité vendue de produit " + i + " : " + cpt[i]);
        }
    }

    public static void main(String[] args) {
        statistics();
    }
}
