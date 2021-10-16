package baseline;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
public class Solution41 {

    public static void main(String[] args) throws FileNotFoundException {
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

        //Arraylist seemed easier so we're doing  an arrayList instead
        ArrayList<String> names = new ArrayList<String>();
        //take in the  input.txt, using the try, do, and catch to make sure everything works
        try (Scanner input = new Scanner(Paths.get("exercise41_input.txt")).useDelimiter("\n"))
        {
            //also use a while to make sure it continues after the delimiter

            while (input.hasNext())
            { //while there is more to read
                //put it into a arrayList
                names.add(input.next());
            }
        }
            //put in the catch
        catch (IOException | NoSuchElementException | IllegalStateException e)
        {
            e.printStackTrace();
            //Send it to another class
        }
                StringSorter userString = new StringSorter(names);
            }
        }
