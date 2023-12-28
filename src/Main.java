import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        System.out.printf("Please select your preferred choice:\n" +
                "\t\t1. Register Account\n" +
                "\t\t2. Book Reservation\n" +
                "\t\t3. Generate Bill\n" +
                "\t\t4. Feedback\n");
        Scanner choice = new Scanner(System.in);
        int myChoice = choice.nextInt(); // input value for option choice


            if (myChoice == 1)
                System.out.println("1. Register Account");
            else if (myChoice == 2)
                System.out.println("2. Book Reservation");
            else if (myChoice == 3)
                System.out.println("3. Generate Bill");
            else if (myChoice == 4)
                System.out.println("4. Feedback");
            else
                System.out.println("Please enter proper choice:");
         }
}