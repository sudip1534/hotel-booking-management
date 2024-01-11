import com.github.cliftonlabs.json_simple.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Customer {


    private String FirstName;
    ArrayList<Double> Acc_Num=new ArrayList<>();
    private String Email;
    private String Address;
    private String Phone_number;


    public Customer(){
}

    public Customer(String firstName, String email, String address, String phone_number) {
        FirstName = firstName;
        Email = email;
        Address = address;
        Phone_number = phone_number;

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
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

    public void writeJsonToFile(JsonObject jsonobject,String filename,String folderPath){
        try(FileWriter fileWriter=new FileWriter(folderPath+"\\"+filename)){
            fileWriter.write(jsonobject.toString());
            System.out.println("JSON file '" + filename + "' created successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    int folderNum=1;
    //WriteInfo() function will create a folder and write the given data in a file and save the file in the folder.
    public void WriteInfo(){
        ///in folder path put your path where you want to create your folder
        String folderPath = "D:\\Techpro Solutions\\New folder\\Hotel_Management_Project\\src\\New Customer";
        folderNum=folderNum+1;

        File folder=new File(folderPath);
        if(!folder.exists()){
            boolean create=folder.mkdir();
            String result= (create) ? "Folder created successfully." :"Failed to create the folder.";
            System.out.println(result);

        }
        else {
            System.out.println("The folder already exists.");
        }

        //Math.random() method will return random number.
        double randomNumber=Math.random();
        //create file name
        String filename="ACC_"+randomNumber+".json";
        Acc_Num.add(randomNumber);
       /* for (String number : Acc_Number) {
            if (number == */
        //Create a JSONObject with  data
        JsonObject jsonobject=new JsonObject();
        jsonobject.put("Name",getFirstName());
        jsonobject.put("PhoneNumber",getPhone_number());
        jsonobject.put("Email Id",getEmail());
        jsonobject.put("Address",getAddress());

        //Calling the writeJsonToFile method to write the json object to the json file
        writeJsonToFile(jsonobject,filename,folderPath);



    }


}
