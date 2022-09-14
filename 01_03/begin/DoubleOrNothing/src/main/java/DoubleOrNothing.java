import java.util.Scanner;

public class DoubleOrNothing {

    public int randomNum() {
        return (int) Math.floor(Math.random() * 2);
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        long points = 10;
        System.out.println("Welcome to Double or Nothing. You begin with 10 points and\n have a chance to double it or loose it all each time you play.\n If you loos it all. the game is over");
        System.out.println("Ok, press \"ENTER\" to begin!");
        scanner.nextLine();
        while (points >= 0) {
            int random = randomNum();
            if (random > 0){
                points = points * 2;
                System.out.println("Lucky!\n");
                System.out.printf("You now have %d points\n", points);
                scanner.nextLine();
            } else {
                points = 0;
                System.out.printf("Aww sorry, you now have %d points\n", points);
               break;
            }
        }
        System.out.println("You lost this one, but you can always play again!");
    }
}