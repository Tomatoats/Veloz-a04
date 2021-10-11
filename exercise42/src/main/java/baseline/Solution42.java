package baseline;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Solution42 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 4 Solutions 42
     *  Copyright 2021 Alexys Veloz
     */
    /* alright so my goal for this one is to try to be cheesy and see if i can
    use commas as a delimiter, and if I can imma use that. Then once they're saved,
    I use a for loop to print out the string[] / ArrayList, and every 3 intervals i put in a /n
    in there so that it looks proper.
     */

    public static void main(String[] args)  {

        //We're gonna use an arrayList for the sake of the psuedocode
        //but if need be we'll switch and/or convert to string[] if need be

        //make an Arraylist to carry all the info in,
        ArrayList<String> input = new ArrayList<String>();

        //take in the  input.txt, using the try, do, and catch to make sure everything works
        //in the try, make sure to use Delimiter ","

        //also use a while to ake sure it continues after the delimiter
        //while there is more to read
        //put it into a arrayList


        //put in the catch

        //send the arrayList to another class

        Table userTable = new Table(input);
    }

}
