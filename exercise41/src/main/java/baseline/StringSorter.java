package baseline;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringSorter {


    private void PrintToTxt(ArrayList SortedNames) throws FileNotFoundException {
        //PrintStream
        PrintStream out = new PrintStream(new FileOutputStream("exercise41_output.txt"));
        System.setOut(out);

        //Print from element 0 to the last element, the sorted names
        int size = SortedNames.size();
        System.out.printf("There are a total of %d names:%n--------------------------%n",size);
        for (int i = 0; i < size; i++)
        {
            System.out.println(SortedNames.get(i));
        }
    }

    private ArrayList Sort(ArrayList names) {
        //Use arrays.Sort() to sort the string and return it
        Collections.sort(names);
        return names;
    }
    public StringSorter(ArrayList names) throws FileNotFoundException {
        //hey so weird things are happening imma try to make this a string first in a new function

        //bring it to a function to sort the string [] / arrayList

        ArrayList SortedNames = Sort(names);

        //bring it to a function to print to a txt
        PrintToTxt(SortedNames);
    }

}
