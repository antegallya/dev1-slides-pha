public class ExosIteratifs {
    public static int sommeChiffresTriche(int nombre) {
        String str = String.valueOf(nombre);
        int somme = 0;
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            int chiffre = Integer.valueOf(String.valueOf(c));
            somme += chiffre;
        }
        return somme;
    }

    /**
     * Résolution de l'exo 76
     */
    public static int sommeChiffres(int nombre) {
        int somme = 0;
        while (nombre > 0) {
            somme += nombre % 10;
            nombre /= 10;
        }
        return somme;
    }

    public static void main(String[] args) {
        int nombre = Integer.valueOf(args[0]);
        System.out.println(sommeChiffresTriche(nombre));
        System.out.println(sommeChiffres(nombre));
    }
}
