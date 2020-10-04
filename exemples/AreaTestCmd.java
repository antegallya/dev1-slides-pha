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
        // Lecture des données à partir des
        // arguments de la ligne de commande.
        double length = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        double area = rectangleArea(length, width);

        System.out.println("Surface: " + area);

        /* Code de retour du programme. Doit être un entier.
         * En général, on l'utilise pour signaler le status d'exécution (0 si
         * tout va bien, une autre valeur pour signaler un problème). */
        System.exit((int) area);
    }
}
