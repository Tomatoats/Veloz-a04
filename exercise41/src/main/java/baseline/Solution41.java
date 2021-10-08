package baseline;

public class Solution41 {

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 4 Solutions 41
         *  Copyright 2021 Alexys Veloz
         */
        /* Okay so we're gonna take in the input from the text file, using
        a delimiter to collect a new string probably unless that doesn't work, and
        once we have the names in a string array, send it to a new class with two methods:
        a sort and a print function. the sort will take the names and sort em, and return that
        and the print function will take it and print it to an output.txt
         */

        //take in the  input.txt, using the try, do, and catch to make sure everything works
        //also use a while to make sure it continues after the delimiter

        //put it into a String[]
        //if String[] doesn't work, then an arrayList instead
        String[] names = new String[0];
        //Send it to another class

        StringSorter userString = new StringSorter(names);
    }
}
