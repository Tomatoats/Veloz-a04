package baseline;

import java.util.ArrayList;
import java.util.Arrays;

public class WordCounter {
    public WordCounter(ArrayList<String> lowerInput) {
        //send it into a function to count how many times a word appears
        int[] counted = TheCounter(lowerInput);
        //send it to a function  that sorts the int array of how many times a word appears
        int[] sortedCounted = TheSorter(counted);
        //send it to a function to print out the results
        Printer(lowerInput, counted, sortedCounted);

    }

    private void Printer(ArrayList<String> lowerInput, int[] counted, int[] sortedCounted) {
        //set a for loop with i and k, check sortedcounted[i] and see which counted[k] matches
        for (int i = 0; i < lowerInput.size();i++)
        {
            for (int k = 0; k < lowerInput.size(); k++)
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
                break;
            }
        }
    }

    private int[] TheSorter(int[] counted) {
        Arrays.sort(counted);
        //use arrays.sort and return.
        return counted;
    }

    private int[] TheCounter(ArrayList<String> lowerInput) {
        int size = lowerInput.size();
        //use two for loops, with i and k. check to see words.get(k) is, and if it is equal to word.get(i)
        int[] array = new int[lowerInput.size()];
        for (int p = 0; p < lowerInput.size(); p++)
        {
            array[p] = 1;
        }
        for (int i = 0; i < lowerInput.size(); i++)
        {
            for (int k = 1; k < lowerInput.size(); k++){
                if ((lowerInput.get(i).equals(lowerInput.get(k)) && k != i)){
                    //increment counted[i];
                    array[i]++;
                    continue;
                }
            }

        }
        for(int j = 0; j < lowerInput.size(); j++){
            System.out.printf("%s %d\n",lowerInput.get(j),(array[j]));
        }
        return array;
    }


}
