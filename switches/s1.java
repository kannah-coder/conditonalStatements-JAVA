public class s1{
    public static void main(String args[]){
         int marks = 86;

        if (marks >= 90 && marks <= 100) {
            System.out.println(" Excellent! Grade A+");
        } else if (marks >= 80 && marks < 90) {
            System.out.println(" Very Good! Grade A");
        } else if (marks >= 70 && marks < 80) {
            System.out.println(" Good! Grade B");
        } else if (marks >= 60 && marks < 70) {
            System.out.println(" Average! Grade C");
        } else if (marks >= 50 && marks < 60) {
            System.out.println(" Needs Improvement! Grade D");
        } else if (marks >= 0 && marks < 50) {
            System.out.println(" Failed! Better luck next time.");
        } else {
            System.out.println(" Invalid Marks Entered");
        }
    }
}