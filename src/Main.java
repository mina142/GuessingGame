import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner guess = new Scanner(System.in);
        int ranNum = 1 + r.nextInt(10);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.println("your guest is : ");
        int num = guess.nextInt();
        while (ranNum != num) {
            System.out.println("That is incorrect. Guess again.");
            System.out.println("your guest is : ");
            num = guess.nextInt();

        }
        if (ranNum == num) {
            System.out.println("That's right! You're a good guesser.");
        }
    }
    }
