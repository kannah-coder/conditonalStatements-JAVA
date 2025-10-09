
public class IfElse{
    public static void main(String args[]){
        int income = 85000;
        boolean seniorCitizen = true;

        if (income < 50000) {
            System.out.println("Tax rate: 5%");
        } else if (income < 100000) {
            if (seniorCitizen) {
                System.out.println("Tax rate: 8%");
            } else {
                System.out.println("Tax rate: 10%");
            }
        } else{
            System.out.println("Tax rate: 15%");
        }

    }
}