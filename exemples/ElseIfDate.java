public class ElseIfDate {
    public static void main(String[] args) {
        String dateFormat, day, month, year, date;
        dateFormat = args[0];
        day = "23";
        month = "09";
        year = "2020";
        date = "";
        if (dateFormat.equals("BE"))
            System.out.println("Goeiedag Bonjour !");
        if (dateFormat.equals("EU") || dateFormat.equals("FR")
                || dateFormat.equals("DE") || dateFormat.equals("BE")) {
            date = day + "-" + month + "-" + year;
        } else if (dateFormat.equals("CN") || dateFormat.equals("KR")) {
            date = year + "/" + month + "/" + day;
        } else if (dateFormat.equals("US")) {
            date = month + "/" + day + "/" + year;
        } else if (dateFormat.equals("ISO")) {
            date = year + "-" + month + "-" + day;
        } else {
            System.err.println("I don't know this format: " + dateFormat);
            System.exit(1);
        }

        System.out.println(date);
    }
}
