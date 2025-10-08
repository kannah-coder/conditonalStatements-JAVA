public class s2 {
    public static void main(String[] args) {
        String season = "April";

        String result = switch (season) {
            case "December", "January", "February" -> "Winter";
            case "March", "April", "May" -> "Summer";
            case "June", "July", "August" -> "Monsoon";
            case "September", "October", "November" -> "Autumn";
            default -> "Invalid Month";
        };

        System.out.println("Season: " + result);
    }
}
