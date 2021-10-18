package baseline;

import java.util.Scanner;

public class inventoryManager {
    private static final Scanner in = new Scanner(System.in).useDelimiter("\n");

    private static String readFromUser(String prompt) {
        System.out.println(prompt);
        //take in the password from the user
        return in.next();
    }

    public inventoryManager(){
    //have a string that is equal to a readFrom User
    String userinput = readFromUser("What is the product name?");
    //while that string does not match any names of the products we have
    //Repeat for them.
    while (!userinput.equals("Thing") && !userinput.equals("Widget") && !userinput.equals("Doodad")) {
        userinput = readFromUser("Sorry, that is not any of our products: Try again!");
    }
        //once they do choose the right thing, print out the Name, Price, and quantity
        System.out.printf("Name: %s%nPrice: %.2f%nQuantity: %d", name, price, quantity);
    }
