package baseline;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindAndReplace {
    private void FindAndReplace(ArrayList input){
        //make two functions: The find and Replace and printToFile
        ArrayList<String> ReplacedInput = Replace(input);

        PrintToFile(ReplacedInput);
    }

    private void PrintToFile(ArrayList<String> replacedInput) {
        //so we use printStream
        //then from the 0th size to the final element
        //print it to a file.

    }

    private ArrayList<String> Replace(ArrayList input) {
        //so we take this arraylist and get the size
        //in a for loop from 0 to the array list size,
        //make a char array that equals that arrayList element.
        //then in that char array make a for loop from the first
        //element to the last, if you see  that the element to that element plus 6
        //if those equal "utilize", switch it to use and change the elements around
        //else continue. once that char array is done, append it to a string via stringbuilder
        //return that to a ArrayList
        return null;
    }
}
