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

    /**
     * Résolution de l'exo 78
     */
    public static void decompoFacteursPremiers(int nombre) {
        // 1001880
        // 2 2 2 3 3 5 11 11 23
        // 2 * 2 * 2 * 3 * 3 * 5 * 11 * 11 * 23
        // 2^3 * 3^2 * 5^1 * 11^2 * 23^1
        // 2^3 * 3^2 * 5 * 11^2 * 23
        int facteur = 2;
        int exposant = 0;
        while (nombre > 1) {
            if (nombre % facteur == 0) {
                nombre /= facteur;
                ++exposant;
            } else {
                switch (exposant) {
                    case 0:
                        break;
                    case 1:
                        System.out.print(facteur + " * ");
                        break;
                    default:
                        System.out.print(
                                facteur + "^" + exposant + " * ");
                }
                exposant = 0;
                ++facteur;
            }
        }

        if (exposant > 0) {
            System.out.print(facteur);
        }
        if (exposant > 1) {
            System.out.print("^" + exposant);
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        int nombre = Integer.valueOf(args[0]);
        decompoFacteursPremiers(nombre);
        //System.out.println(sommeChiffresTriche(nombre));
        //System.out.println(sommeChiffres(nombre));
    }
}
