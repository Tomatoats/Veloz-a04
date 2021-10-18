import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class CounterTest {
    @Test
    void doesSortWork() {
        int[] expected = new int[3];
        int[] actual = new int[3];
        expected[0] = 5;
        expected[1] = 10;
        expected[2] = 15;

        actual[0] = 10;
        actual[1] = 15;
        actual[2] = 5;
        Arrays.sort(actual);
        assertEquals(actual[2], expected[2]);


    }

    @Test
    void doesCounterWork() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Pablo");
        names.add("John");
        names.add("Pablo");
        int i;
        int k;
        boolean equals = false;
        for (i = 0; i < names.size(); i++) {
            for (k = 1; k < names.size(); k++) {
                if (names.get(k).equals(names.get(i)) && k != i) {
                    System.out.printf("hey, %s and %s are the same!%n", names.get(k), names.get(i));
                    equals = true;
                }
            }
        }
        assertTrue(equals);
        //this test works but it doesn't in my actual code but i did the same logic i'm so confused
    }

    @Test
    void doesPrinterWork() {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Pablo");
        names.add("Pablo");
        int[] sortedCounted = new int[2];
        sortedCounted[0] = 2;
        sortedCounted[1] = 1;
        int[] counted = new int[2];
        counted[0] = 1;
        counted[1] = 2;
        int counter = 0;
        boolean equals = false;
        for (int value : sortedCounted) {
            for (int k = 0; k < sortedCounted.length; k++) {
                if (value == counted[k]) {
                    equals = true;
                    //whatever counted[k] is, print words.get(k) and a star for however much sortedcounted[i] equals.
                    System.out.printf("%-12s:", names.get(k));
                    for (int j = 0; j < value; j++) {
                        System.out.printf("*");
                    }
                    System.out.printf("%n");
                }
                //look in the test results and you'll see it printed out:
                //Pablo       :**
                //John        :*
                //idk why it works here but not in my code i did the same exact logic

            }
        }
        assertTrue(equals);
    }
}
/*Solarlint Warnings
Solution 46: 0 warnings
WordCounter: 8 warnings
7 of then are replace wit a logger so we can ignore, then one is the whole "use list instead of Arraylist" but
doing so would break my code as I need some of the string functions for this to work, so we ignore
CounterTest: 2 warnings and both of them are about System.out so we can ignore

Sorry that my code doesn't work right for this one. I feel like my logic is right, and it works here in test code!
My guess is that something about the strings aren't matching somehow byte wise but I don't understand cause I checked them
and they're fine. Dock off points if you must but i'd also love an explanation / guess as to why it won't work
 */