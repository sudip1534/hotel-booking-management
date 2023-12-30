import java.util.Scanner;

public class Customer {


    private String FirstName;
    private String Email;
    private String Address;
    private String Phone_number;


    public Customer(){

        Scanner choice=new Scanner(System.in);
        System.out.println("Enter your FirstName :\n");
        FirstName=choice.nextLine();
        System.out.println("Enter your Email :\n");
        Email=choice.nextLine();
        System.out.println("Enter your Address :\n");
        Address=choice.nextLine();
        System.out.println("Enter your Phone_Number :\n");
        Phone_number=choice.nextLine();

}

    public String getFirstName() {
        return FirstName;
    }
    public String getPhone_number() {
        return Phone_number;
    }

    public String getEmail(){
        return Email;
    }

    public String getAddress() {
        return Address;
    }


}
