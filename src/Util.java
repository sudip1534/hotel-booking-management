import java.util.Scanner;

public class Util {

    Scanner input=new Scanner(System.in);
    public void registration(){


        System.out.print("Please enter your Name :");
        String firstName=input.nextLine();
        System.out.print("Please enter your Email ID : ");
        String email= input.nextLine();
        System.out.print("Please enter your Address : ");
        String address=input.nextLine();
        System.out.print("Please enter your phone number :");
        String phone_number= input.next();
        //calling the class UserRegistration constructor.
        Customer userinfo=new Customer(firstName,email,address,phone_number);
        userinfo.WriteInfo();

    }
    public void bookReservation(){

        System.out.println("Do you already completed your registration?(Y/N)");
        String Value= input.nextLine();
        if(Value=="Y"){

            System.out.println("Enter your Account Number");
            String Acc_Num = input.nextLine();
         Reservation reservation=new Reservation(Acc_Num);

        }
        else
            registration();


    }
    public void generateBill(){
        //will be implemented later
    }
    public void userFeedback(){
        //will be implemented later
    }
}



