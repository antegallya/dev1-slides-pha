import java.util.Scanner;
public class SalesStatsSwitch {

    public static void statistics(){
        Scanner keyboard = new Scanner(System.in);
        int cpt0, cpt1, cpt2, cpt3, cpt4, cpt5, cpt6, cpt7, cpt8, cpt9;
        int productId, quantity;
        cpt0 = 0;
        cpt1 = 0;
        cpt2 = 0;
        cpt3 = 0;
        cpt4 = 0;
        cpt5 = 0;
        cpt6 = 0;
        cpt7 = 0;
        cpt8 = 0;
        cpt9 = 0;
        System.out.print("Introduire le numéro de produit : ");
        productId = keyboard.nextInt();
        while (productId != -1){
            System.out.print("Quantité : ");
            quantity = keyboard.nextInt();
            switch (productId){
                case 0:
                    cpt0 = cpt0 + quantity;
                    break;
                case 1:
                    cpt1 = cpt1 + quantity;
                    break;
                case 2:
                    cpt2 = cpt2 + quantity;
                    break;
                case 3:
                    cpt3 = cpt3 + quantity;
                    break;
                case 4:
                    cpt4 = cpt4 + quantity;
                    break;
                case 5:
                    cpt5 = cpt5 + quantity;
                    break;
                case 6:
                    cpt6 = cpt6 + quantity;
                    break;
                case 7:
                    cpt7 = cpt7 + quantity;
                    break;
                case 8:
                    cpt8 = cpt8 + quantity;
                    break;
                case 9:
                    cpt9 = cpt9 + quantity;
                    break;
            }
            System.out.print("Introduire le numéro de produit : ");
            productId = keyboard.nextInt();
        }

        System.out.println("Quantité vendue de produit 0 : " + cpt0);
        System.out.println("Quantité vendue de produit 1 : " + cpt1);
        System.out.println("Quantité vendue de produit 2 : " + cpt2);
        System.out.println("Quantité vendue de produit 3 : " + cpt3);
        System.out.println("Quantité vendue de produit 4 : " + cpt4);
        System.out.println("Quantité vendue de produit 5 : " + cpt5);
        System.out.println("Quantité vendue de produit 6 : " + cpt6);
        System.out.println("Quantité vendue de produit 7 : " + cpt7);
        System.out.println("Quantité vendue de produit 8 : " + cpt8);
        System.out.println("Quantité vendue de produit 9 : " + cpt9);
    }

    public static void main(String[] args) {
        statistics();
    }

}
