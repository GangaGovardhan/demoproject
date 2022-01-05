
public class CheckYear_leaporNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // The desired year to check.
        int year = 2000;
        
        // Implementing our algorithm.
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
    }
}