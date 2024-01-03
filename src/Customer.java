import java.util.Scanner;

public class Customer {


    private String FirstName;
    private String Email;
    private String Address;
    private String Phone_number;


    public Customer(){

        Scanner choice=new Scanner(System.in);
        System.out.println("Enter your FirstName :");
        FirstName=choice.nextLine();
        System.out.println("Enter your Email :");
        Email=choice.nextLine();
        System.out.println("Enter your Address :");
        Address=choice.nextLine();
        System.out.println("Enter your Phone_Number :");
        Phone_number=choice.nextLine();

}

    public String getFirstName() {
        return FirstName;
    }


    public String getEmail(){
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone_number() {
        return Phone_number;
    }


}
