import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void parsertest() {

        ArrayList<String> arraylist = new ArrayList<>();
        ArrayList<String> parsedArraylist = new ArrayList<>();
        arraylist.add("100,200,300");
        String commaString = arraylist.get(0);
        String[] parsed;
        parsed = commaString.split(",");
        parsedArraylist.add(parsed[0]);
        assertEquals("100",parsed[0]);
    }
    @Test
    void outputTest(){
        String result = "Ling      Mai       55900     ";

        String[] input = new String[3];
        input[0] ="Ling";
        input[1] = "Mai";
        input[2] = "55900";
        String actual = input[0] + "      "+input[1]+"       "+input[2]+"     ";
        assertEquals(actual, result);
    }
    }
    /*Sonar Lint Stuff:
    Solution42: 0 Sonarlint warnings
    Table:6 sonarlint warnings
    2 of them are use logger instead of system.out so we can ignore
    the rest are all about not arrayList<string> in my stuff but eveytime I try to fix
    it in accordance to sonarlint, I either get an actual warning warning in my code since some
    list stuff doesn't work with string arraylists (like .equals for example) or etc.
    if you can show me how to fix these i'd be happy but idk how
    TableTest: 1 warning
    It is saying "Mismatched  query and update of collecttion" which brought me to weird menus
    that idk how to use and got me super confused.
     */

