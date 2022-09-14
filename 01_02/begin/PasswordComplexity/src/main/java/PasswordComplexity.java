import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordComplexity {

    public static boolean isPasswordComplex(String password) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z]).{6,200}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
    }



    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a password: ");
       String userInput = scanner.nextLine();
       System.out.println("Is the password complex? " +
               isPasswordComplex(userInput));
    }
}
