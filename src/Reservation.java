public class Reservation extends Customer {


    Double Account_Number;

    public Reservation(Double Account_Number) {

        this.Account_Number = Account_Number;


    }

    public void setAccount_Number(Double account_Number) {
        Account_Number = account_Number;
    }

    public Double getAccount_Number() {
        return Account_Number;
    }

    public Reservation(String firstName, String email, String address, String phone_number) {
        super(firstName, email, address, phone_number);
    }

    public void Booking() {
        for (Double item : Acc_Num) {

            if (item.equals(Account_Number)) {
                System.out.println("Select Hotel");
                System.out.println("Select Villa");
                System.out.println("Select Room");
            }
        }

    }

}

