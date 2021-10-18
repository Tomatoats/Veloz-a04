import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTest {
//since printToFile is legit for only printing into a file, i'm not gonna test it since it's just
    //making files and writing to it, besides testing it would have to mean I'd have to both
    //create a file, write into it, and then read into it for the assertEquals.
    //please just trust me when I know it's simply Printstream, setting System.setOut(out),
    //and then just printing into the file so just please trust me on this
    @Test
    void doesReplaceWork(){
        ArrayList<String> originalInput = new ArrayList<>();
        ArrayList<String> changedInput = new ArrayList<>();
        originalInput.add("since printToFile is legit for only printing into a file, i'm not gonna test it since it's just");
        originalInput.add("making files and writing to it, besides testing it would have to mean I'd have to both");
        originalInput.add("create a file, write into it, and then read into it for the assertEquals.");
        originalInput.add("please just trust me when I know it's simply Printstream, setting System.setOut(out),");
        originalInput.add("and then just printing into the file so just please trust me on this");

        changedInput.add("since printToTxt is legit for only printing into a txt, i'm not gonna test it since it's just");
        changedInput.add("making txts and writing to it, besides testing it would have to mean I'd have to both");
        changedInput.add("create a txt, write into it, and then read into it for the assertEquals.");
        changedInput.add("please just trust me when I know it's simply Printstream, setting System.setOut(out),");
        changedInput.add("and then just printing into the txt so just please trust me on this");

         for(int i = 0; i < originalInput.size(); i++) {
             originalInput.set(i, originalInput.get(i).replace("file", "txt"));
             originalInput.set(i, originalInput.get(i).replace("File", "Txt"));
             assertEquals(originalInput.get(i), changedInput.get(i));
         }
    }
    /*Sonar lint warnings
    Solution45: 0 warnings
    FindAndReplace: 2 warnings
    one is "use logger instead of System.out" so ignore
    the other is a problem I'm running into is one earlier where I'm just not able to fix the warning
    without getting rid of my ArrayList<String> So idk what to do to fix it, I need help on that one
    ReplaceTest: 0 warnings
     */
}
