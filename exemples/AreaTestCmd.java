public class AreaTestCmd {
    /*
     * Calcule la surface d'un rectangle dont on donne la largeur et 
     * la longueur.
     *
     * Les données ne sont pas négatives.
     */
    public static double rectangleArea(double length, double width){
        return length * width;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.exit(1);
        }
        // Lecture des données à partir des
        // arguments de la ligne de commande.
        double length = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        if (length < 0 || width < 0) {
            System.exit(1);
        }

        double area = rectangleArea(length, width);

        System.out.println("Surface: " + area);
        //System.exit(0);
    }
}
