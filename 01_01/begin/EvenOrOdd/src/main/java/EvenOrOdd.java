import java.util.Scanner;

public class EvenOrOdd {

   public static boolean isEven(int n) {
       if (n % 2 == 0) {
           return true;
       } else {
           return false;
       }
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int userNum = scanner.nextInt();
       boolean result = isEven(userNum);
       System.out.println("Is the number even? ");
       if (result == true) {
           System.out.println("Yes, the number " + userNum + " is even.");
       } else {
           System.out.println("No, the number " + userNum + " is not even.");
       }
   }
}
