package baseline;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class FindAndReplace {
    public FindAndReplace(ArrayList<String> input) throws FileNotFoundException {
        //make two functions: The find and Replace and printToFile
        //have replace equal an  ArrayList with use instead of utilize
        ArrayList<String> replacedInput = replace(input);
        //print the proper arrayList
        printToFile(replacedInput);
    }



    private void printToFile(ArrayList<String> replacedInput) throws FileNotFoundException {
        //so we use printStream
        PrintStream out = new PrintStream(new FileOutputStream("data/exercise45_output.txt"));
        System.setOut(out);
        //then from the 0th size to the final element
        for (String s : replacedInput) {
            //print it to a file.
            System.out.printf("%s", s);
        }

    }

    private ArrayList<String> replace(ArrayList<String> input) {
      /* okay so I have a different idea: I did some research and turns out that
      java has a string function called replace so we're just gonna call the arraylist a string and use replace to switch out
        utilize for use
       */
        //use replace to replace "utilize" with "use" in a for loop

        for(int i = 0; i < input.size(); i++){
            input.set(i,input.get(i).replace("utilize", "use"));
            input.set(i,input.get(i).replace("Utilize", "Use"));


        }

        return input;
    }
}
