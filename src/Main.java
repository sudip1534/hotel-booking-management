import java.util.Scanner;



public class Main {


        public static void displayMenu() {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            System.out.printf("Please select your preferred choice:\n" +
                    "\t\t1. Register Account\n" +
                    "\t\t2. Book Reservation\n" +
                    "\t\t3. Generate Bill\n" +
                    "\t\t4. Feedback\n" +
                    "\t\t5. Exit\n");

        }




    public static void main(String[] args) {


        Scanner choice = new Scanner(System.in);
        Util util=new Util();

        while (true)
        {

            displayMenu();

            int myChoice = choice.nextInt();       // input value for option choice
            if (myChoice == 1)
            {
                util.registration();
            }
            else if (myChoice == 2)
            {
                System.out.println("2. Book Reservation");
                util.bookReservation();
            }

            else if (myChoice == 3)
                System.out.println("3. Generate Bill");
            else if (myChoice == 4)
                System.out.println("4. Feedback");
            else if(myChoice==5) {
                System.out.println("Closed the program");
                return;
                }
            else
                System.out.println("Please enter proper choice:");
        }




    }
}