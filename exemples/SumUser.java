import java.util.Scanner;

public class SumUser {
    public static int sum1() {
        int nbTerms;    // Nombre de valeurs à additionner
        int term;       // Terme de l'addition
        int sum = 0;    // Somme construite au fur et à mesure
        Scanner keyboard = new Scanner(System.in);

        nbTerms = keyboard.nextInt();
        //répéter tant que j'ai pas lu assez de nombres.
        //while (i < nbTerms) {
        // répéter nbTerms fois :
        for (int i = 0; i < nbTerms; ++i) {
            term = keyboard.nextInt(); /* Lire un entier sur le terminal */
            sum += term; //sum = sum + term;
            //++i; //i++ //i += 1; //i = i + 1;
        }
        return sum;
    }

    public static int sum1b() {
        int nbTerms;    // Nombre de valeurs à additionner
        int term;       // Terme de l'addition
        int sum = 0;    // Somme construite au fur et à mesure
        Scanner keyboard = new Scanner(System.in);

        nbTerms = -1;
        while (nbTerms < 0) {
            System.out.print("Entrez le nombre d'éléments : ");
            if (keyboard.hasNextInt())
                nbTerms = keyboard.nextInt();
            else
                keyboard.next();
        }
        keyboard.nextLine();
        /*
        System.out.print("Entrez le nombre d'éléments : ");
        while (!keyboard.hasNextInt()) {
            System.out.print("Entrez le nombre d'éléments : ");
            keyboard.next();
        }
        nbTerms = keyboard.nextInt();*/
        System.out.print("Entrez le ou les éléments : ");
        for (int i = 0; i < nbTerms; ++i) {
            term = keyboard.nextInt();
            sum += term;
        }
        return sum;
    }

    public static int sum2() {
        boolean hasMore;
        int term;
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrer un nombre ? (True/False) : ");
        hasMore = keyboard.nextBoolean();
        while (hasMore) {
            System.out.print("Entrez le nombre : ");
            term = keyboard.nextInt();
            sum += term;
            System.out.print("Entrer un nombre ? (True/False) : ");
            hasMore = keyboard.nextBoolean();
        }
        return sum;
    }

    public static int sum2b() {
        boolean hasMore;
        int term;
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);

        // hasMore = True et un while au lieu du do-while.
        do {
            System.out.print("Entrer un nombre ? (True/False) : ");
            hasMore = keyboard.nextBoolean();
            // Une utilité du break ici. À utiliser parcimonieusement !
            if (!hasMore)
                break;
            System.out.print("Entrez le nombre : ");
            term = keyboard.nextInt();
            sum += term;
        } while (true);
        return sum;
    }

    public static int sum3() {
        int term;       // Un des termes de l'addition
        int sum = 0;    // La somme
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Entrez les termes et terminez par -1");
        term = keyboard.nextInt();
        // term = 0; et lecture du int d'abord.
        while (term != -1) {
            sum += term;
            term = keyboard.nextInt();
        }
        return sum;
    }

    public static int sum3b() {
        int term;       // Un des termes de l'addition
        int sum = 0;    // La somme
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Entrez les termes et terminez par -1");
        term = 0;
        while (term != -1) {
            if (keyboard.hasNextInt()) {
                term = keyboard.nextInt();
                if (term != -1)
                    sum += term;
            } else {
                keyboard.next();
            }
        }
        return sum;
    }

    public static int sum3c() {
        int sum = 0;    // La somme
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Entrez les termes et terminez par stop");
        while (true) {
            if (keyboard.hasNextInt()) {
                sum += keyboard.nextInt();
            } else if (keyboard.next().equals("stop")) {
                break;
            }
        }
        return sum;
    }

    public static int sum4() {
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        while (keyboard.hasNext()) {
            if (keyboard.hasNextInt())
                sum += keyboard.nextInt();
            else
                keyboard.next();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("La somme est : " + sum1());
    }
}
