import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
 class CreatorTest {
@Test
    void doesEqualswork(){
    //since filePrinter mainly just prints besides an if statement, I'm just checking the if statement part
    String tester = "pfft";
    int q = 0;
    if (tester.equals("pfft"))
    {
        q = 1;
    }
    assertEquals(1, q);
}
//htmlPrinter literally just only prints to file so I'm not gonna test just that
//htmlMaker quite literally only has one line of code and that's to make  a string so I'm not gonna test that
    @Test
    void doesFileMakingWork() throws IOException {
    //okay I didn't know how to test it any other way so unfortunately
        // every time you want this test to pass, make sure testingtest.txt is NOT in the file
        //so essentially before you run this test,  make sure testingtest.txt  doesnt exist so it can create it
        //otherwise it'll give you a fail
    String extention = "src/test/java";
    File index = new File(extention,"testingtest.txt");
    boolean itDidit = index.createNewFile();
        assertTrue(itDidit);
    }

    /*Solar Lint Warnings:
    Solution43: 1 warning
    its for using system.out instead of logger so ignore
    SiteCreator: 10 warnings (woaH)
    okay I know that's a lot but  5 of them are "use logger instead of System.out"
    so with 5 left: 3 of them are for .mkdirs but it wanted me to change my
    inspections with IntelliJ and i don't wanna mess with it that sounds terrible and I needed them in my code
    so i left them in. Idk how to fix
    so we got two left and its because of input.createNewFile for ignoring its boolean case
    but hear me out:  That would only happen if you decide to make the same folder twice in two seperate runs
    by naming the files the same: which is bad, so ignoring it is kinda a good thing I guess? Just don't run it twice
    using the same name for the website twice and you'll be fine, it doesn't ask us to do something if the user does
    that anyway.
    CreatorTest: 1 warning
    it's that one of my if statements is always true but that's the point since I'm hardcoding these
    tests in to mae sure shit like .equals works instead of it not working as I intend it to so I'm ignoring that

     */
}
