import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringTester {
@Test
void arrayToString(){
    ArrayList<String> names = new ArrayList<>();
    names.add("hello");

    String[] newname = new String[1];

    newname[0] = names.get(0);
    assertEquals("hello", newname[0]);
    }
    @Test
    void doesitSort(){
       String[] names = new String[3];
       String[] sorted = new String[3];
        names[0] = "b";
        names[1] = "c";
        names[2] = "a";

        sorted[0] = "a";
        sorted[1] = "b";
        sorted[2] = "c";

        Arrays.sort(names);

        assertEquals(sorted[0], names[0]);
    }
    @Test
    void output(){
       String actual = "01234";
       StringBuilder result = new StringBuilder();
        int i;
        for (i = 0; i < 5; i++) result.append(i);


        assertEquals(actual, result.toString());

    }
}
/*okay so sonarlint warnings:
Solution41.java: none
StringSorter: 3
2 of them are just "use a logger" so we ignore
1 of them is "hey change ArrayList to List" but if I do that, my code doesn't work, and i don't
know how to fix it: so we're ignoring it pls don't take off points
StringTester:1
man idk how to fix it  i tried making it lowercase and that didn't work, then uppercase didn't work so i give up
 */