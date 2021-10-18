package baseline;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         *  UCF COP3330 Fall 2021 Assignment 4 Solutions 45
         *  Copyright 2021 Alexys Veloz
         */
        /*So the goal is to take in the input from file and put in a string.
        then we're going to to look at it at each element. if that element equals u,
        the next element equals t, the next element equals i,etc etc till it spells utilize,  then we're gonna use a string builder
        to take everything before the string element, put in the word use, and take in the rest of the string
        then continue looking through the string for utilize until we're done with the string.
         */
        //We're gonna use an arrayList just to get in the string from the input.txt

        //Make an array list to hold the input
        ArrayList<String> userinput = new ArrayList<>();

        //take in the  input.txt, using the try, do, and catch to make sure everything works
        try (Scanner input = new Scanner(Paths.get("data/exercise45_input.txt")).useDelimiter("%n")) {
            //also use a while to make sure it continues after the delimiter
            while (input.hasNext()) {
                //while there is more to read
                //put it into a arrayList
                userinput.add(input.next());
            }
        }
        //put in the catch
        catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

        //Send it to another class
        new FindAndReplace(userinput);
    }
}
