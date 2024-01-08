import java.util.Scanner;

public class Util {
    public void registration(){

        Scanner input=new Scanner(System.in);
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
        //will be implemented later
    }
    public void generateBill(){
        //will be implemented later
    }
    public void userFeedback(){
        //will be implemented later
    }
}



