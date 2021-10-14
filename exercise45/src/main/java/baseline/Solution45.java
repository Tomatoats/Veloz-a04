package baseline;

import java.io.FileNotFoundException;
import java.util.ArrayList;

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
        ArrayList<String> input = new ArrayList<String>();

        //take in the  input.txt, using the try, do, and catch to make sure everything works

        //also use a while to make sure it continues after the delimiter

        //while there is more to read
        //put it into a arrayList

        //put in the catch

        //Send it to another class
        FindAndReplace userReplace = new FindAndReplace(input);
    }
}
