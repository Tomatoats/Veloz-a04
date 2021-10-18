package baseline;

import java.util.ArrayList;
import java.util.Arrays;

public class WordCounter {
    public WordCounter(ArrayList<String> lowerInput) {
        //send it into a function to count how many times a word appears
        int[] counted = theCounter(lowerInput);
        //send it to a function  that sorts the int array of how many times a word appears
        int[] sortedCounted = theSorter(counted);
        //send it to a function to print out the results
        printer(lowerInput, counted, sortedCounted);

    }

    private void printer(ArrayList<String> lowerInput, int[] counted, int[] sortedCounted) {
        //set a for loop with i and k, check sortedcounted[i] and see which counted[k] matches
        for (int i = 0; i < lowerInput.size();i++)
        {
            for (int k = 0; true; k++)
            {
                if (sortedCounted[i] == counted[k])
                {
                    //whatever counted[k] is, print words.get(k) and a star for however much sortedcounted[i] equals.
                    System.out.printf("%-12s:",lowerInput.get(k));
                    for (int j = 0; j < sortedCounted[i]; j++)
                    {
                        System.out.printf("*");
                    }
                    System.out.printf("%n");
                    break;
                }
            }
        }
    }

    private int[] theSorter(int[] counted) {
        Arrays.sort(counted);
        //use arrays.sort and return.
        return counted;
    }

    private int[] theCounter(ArrayList<String> lowerInput) {
        int size = lowerInput.size();
        //use two for loops, with i and k. check to see words.get(k) is, and if it is equal to word.get(i)
        int[] array = new int[size];
        for (int p = 0; p < size; p++)
        {
            array[p] = 1;
        }
        for (int i = 0; i < lowerInput.size(); i++)
        {
            for (int k = 1; k < lowerInput.size(); k++){
                if ((lowerInput.get(k).equals(lowerInput.get(i)) && k != i)){
                    //increment counted[i]
                    System.out.printf("%s[%d] = %s[%d]%n", lowerInput.get(k),k, lowerInput.get(i), i);
                    array[i]++;
                }
            }
            if (lowerInput.get(2).equals(lowerInput.get(0))){
                System.out.println("help im dying");
            }
        }

        return array;
    }


}
