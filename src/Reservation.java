public class Reservation extends Customer{


    String Account_Number;

    public Reservation(String Account_Number){

        this.Account_Number=Account_Number;


    }

    public Reservation(String firstName, String email, String address, String phone_number) {
        super(firstName, email, address, phone_number);
    }
    public void Booking ()
    {
        if (this.Account_Number==super.getPhone_number())
        {

            System.out.println("Select Hotel");
            System.out.println("Select Villa");
            System.out.println("Select Room");
        }

    }



}
