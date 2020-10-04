public class SwitchDate {
    public static void main(String[] args) {
        String dateFormat, day, month, year, date;
        dateFormat = args[0];
        day = "23";
        month = "09";
        year = "2020";
        date = "";

        switch (dateFormat) {
            case "BE":
                System.out.println("Goeiedag Bonjour !");
            case "EU": case "FR": case "DE":
                date = day + "-" + month + "-" + year;
                break;
            case "CN": case "KR":
                date = year + "/" + month + "/" + day;
                break;
            case "US":
                date = month + "/" + day + "/" + year;
                break;
            case "ISO":
                date = year + "-" + month + "-" + day;
                break;
            default:
                System.err.println("I don't know this format: " + dateFormat);
                System.exit(1);
        }

        System.out.println(date);
    }
}
