import com.github.cliftonlabs.json_simple.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        System.out.printf("Please select your preferred choice:\n" +
                "\t\t1. Register Account\n" +
                "\t\t2. Book Reservation\n" +
                "\t\t3. Generate Bill\n" +
                "\t\t4. Feedback\n");
        Scanner choice = new Scanner(System.in);


        while (true)
        {
            int fileValue=1;
            int myChoice = choice.nextInt();       // input value for option choice
            if (myChoice == 1)
            {

                double randomnumber = Math.random();
                System.out.println("1. Register Account");

                try {
                    Path path = Paths.get("D:\\Techpro Solutions\\New folder\\Hotel_Management_Project\\New Customer"+ fileValue);
                    fileValue++;

                    Files.createDirectory(path);

                    System.out.println("New Folder is created!");

                } catch (IOException e) {

                    System.err.println("Failed to create Folder!" + e.getMessage());

                }
                Customer customer=new Customer();


                JsonObject jsonObject= new JsonObject();


                String fileName = "ACC_" + randomnumber + ".json";

                File file = new File("D:\\Techpro Solutions\\New folder\\Hotel_Management_Project" + fileName);
                jsonObject.put("First_Name", customer.getFirstName());
                jsonObject.put("Email", customer.getEmail());
                jsonObject.put("Address", customer.getAddress());
                jsonObject.put("Phone_number", customer.getPhone_number());



                try {
                    FileWriter fileNew = new FileWriter(file);
                    fileNew.write(jsonObject.toString());
                    fileNew.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("JSON file created: "+jsonObject);
            }






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
}