package baseline;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Table {
    public Table(ArrayList<String> input) throws FileNotFoundException {
        //aight so this is gonna be kinda easy
        //Make a function to output the input
        ArrayList<String> seperatedInput = parser(input);
        tableOutput(seperatedInput);
    }

    private ArrayList<String> parser(ArrayList<String> input) {
        ArrayList<String> toAdd = new ArrayList<>();
        for (String commas : input) {
            String[] nocommas = commas.split(",");
            toAdd.add(nocommas[0]);
            toAdd.add(nocommas[1]);
            toAdd.add(nocommas[2]);
        }
        return toAdd;
    }

    private void tableOutput(ArrayList<String> seperatedInput) throws FileNotFoundException {
        //set up printstream stuff
        PrintStream out = new PrintStream(new FileOutputStream("exercise42_output.txt"));
        System.setOut(out);

        //Print out the initial table, yknow "last first Salary " and all the ---
        System.out.printf("    Last      First     Salary%n--------------------------------%n    ");
        //in a for loop from 0 to the size of the array:
        for (String s : seperatedInput) {
            System.out.printf("%-10s", s);
        }
    }
}
