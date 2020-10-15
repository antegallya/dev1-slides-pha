public class DateUtils {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0);
    }

    /*
    public static int nbDaysInMonth(int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return -1;
        }
    }

    public static int nbDaysInMonth(int year, int month) {
        int nbDays = nbDaysInMonth(month);
        if (month == 2 && isLeapYear(year))
            nbDays += 1;
        return nbDays;
    }
    */

    public static int nbDaysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            default:
                return -1;
        }
    }

    public static boolean validDate(int year, int month, int day) {
        return 0 <= day && day <= nbDaysInMonth(year, month);
    }

    public static void displayTest(int year, int month, int day) {
        System.out.println(
                "validDate(" + year + ", " + month + ", " + day + ") -> "
                + validDate(year, month, day));
    }

    /* Simple tests */
    public static void main(String[] args) {
        displayTest(2020, 10, 4);
        displayTest(2020, 9, 31);
        displayTest(2020, 2, 29);
        displayTest(2019, 2, 29);
        displayTest(2020, 2, -1);
        displayTest(2020, 13, 2);
    }
}
