package baseline;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Table {
    public Table(ArrayList<String> input) throws FileNotFoundException {
        //aight so this is gonna be kinda easy
        //Make a function to output the input

        tableOutput(input);
    }

    private void tableOutput(ArrayList<String> input) throws FileNotFoundException {
        //set up printstream stuff
        PrintStream out = new PrintStream(new FileOutputStream("exercise42_output.txt"));
        System.setOut(out);

        //Print out the initial table, yknow "last first Salary " and all the ---
        System.out.printf("Last      First     Salary%n------------------------------%n");
        //in a for loop from 0 to the size of the array:
        for (String s : input) {
            System.out.printf("%-15s ", s);

        }
    }
}
