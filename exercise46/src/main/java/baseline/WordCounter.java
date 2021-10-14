package baseline;

import java.util.ArrayList;
import java.util.Arrays;

public class WordCounter {
    public WordCounter(String lowerInput) {
        //turn lowerInput into an arrayList
        ArrayList<String> words = Converter(lowerInput);
        //send it into a function to count how many times a word appears
        int[] counted = TheCounter(lowerInput);
        //send it to a function  that sorts the int array of how many times a word appears
        int[] sortedCounted = TheSorter(counted);
        //send it to a function to print out the results
        Printer(words, counted, sortedCounted);

    }

    private void Printer(ArrayList<String> words, int[] counted, int[] sortedCounted) {
        //set a for loop with i and k, check sortedcounted[i] and see which counted[k] matches
        //whatever counted[k] is, print words.get(k) and a star for however much sortedcounted[i] equals.
    }

    private int[] TheSorter(int[] counted) {
        //use arrays.sort and return.
        return null;
    }

    private int[] TheCounter(String lowerInput) {
        //use two for loops, with i and k. check to see words.get(k) is, and if it is equal to word.get(i)
        //increment counted[i];
        return null;
    }

    private ArrayList Converter(String lowerInput) {
        //convert the string to an array list.
        return null;
    }
}
