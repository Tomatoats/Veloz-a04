package baseline;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringSorter {


    private void PrintToTxt(String[] Stringnames, ArrayList names) throws FileNotFoundException {
        //PrintStream
        PrintStream out = new PrintStream(new FileOutputStream("exercise41_output.txt"));
        System.setOut(out);

        //Print from element 0 to the last element, the sorted names
        int size = names.size();
        System.out.printf("There are a total of %d names:%n--------------------------%n",size);
        for (int i = 0; i < size; i++)
        {
            System.out.printf("%s", Stringnames[i]);
        }
    }

    private String[] Sort(String[] Stringnames) {
        //Use arrays.Sort() to sort the string and return it
        Arrays.sort(Stringnames);
        return Stringnames;
    }
    public StringSorter(ArrayList names) throws FileNotFoundException {
        //hey so weird things are happening imma try to make this a string first in a new function
        String[] Stringnames = Stringify(names);

        //bring it to a function to sort the string [] / arrayList

        String[] SortedNames = Sort(Stringnames);

        //bring it to a function to print to a txt
        PrintToTxt(Stringnames, names);
    }

    private String[] Stringify(ArrayList names) {
        int size = names.size();
        String[] StringName = new String[size];
        for (int i = 0; i < size; i++)
        {
            StringName[i] = (String) names.get(i);
        }
        return StringName;
    }
}
