import java.util.Scanner;

public class ConditionalMix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day number (1-7): ");
        int day = sc.nextInt();

        // Step 1: Use switch to decide the day name
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid";
        }

        // Step 2: Use if–else to check weekend or weekday
        if (day >= 1 && day <= 5) {
            System.out.println(dayName + " → Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println(dayName + " → Weekend ");
        } else {
            System.out.println("Please enter a valid day number (1–7).");
        }

        sc.close();
    }
}
