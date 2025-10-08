public class nesSwitch{
    public static void main(String[] args) {
        String department = "IT";
        int year = 2;

        switch (department) {
            case "IT":
                switch (year) {
                    case 1:
                        System.out.println("IT 1st Year subjects");
                        break;
                    case 2:
                        System.out.println("IT 2nd Year subjects");
                        break;
                    default:
                        System.out.println("Invalid year for IT");
                }
                break;

            case "CSE":
                switch (year) {
                    case 1:
                        System.out.println("CSE 1st Year subjects");
                        break;
                    case 2:
                        System.out.println("CSE 2nd Year subjects");
                        break;
                    default:
                        System.out.println("Invalid year for CSE");
                }
                break;

            default:
                System.out.println("Unknown Department!");
        }
    }
}