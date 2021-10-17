package baseline;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class StringSorter {


    private void printToTxt(String[] stringNames, ArrayList<String> names) throws FileNotFoundException {
        //PrintStream
        PrintStream out = new PrintStream(new FileOutputStream("data/exercise41_output.txt"));
        System.setOut(out);

        //Print from element 0 to the last element, the sorted names
        int size = names.size();
        System.out.printf("There are a total of %d names:%n--------------------------%n",size);
        for (int i = 0; i < size; i++)
        {
            System.out.printf("%s", stringNames[i]);
        }
    }


    private void sort(String[] stringNames) {
        //Use arrays.Sort() to sort the string and return it
        Arrays.sort(stringNames);
    }

        public StringSorter(ArrayList<String> names) throws FileNotFoundException {
            //hey so weird things are happening imma try to make this a string first in a new function
            String[] stringNames = stringify(names);

            //bring it to a function to sort the string [] / arrayList
            sort(stringNames);

            //bring it to a function to print to a txt
            printToTxt(stringNames, names);
        }

        private String[] stringify(ArrayList<String> names) {
            int size = names.size();
            String[] stringName = new String[size];
            for (int i = 0; i < size; i++)
            {
                stringName[i] = names.get(i);
            }
            return stringName;
        }
    }
