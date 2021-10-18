package baseline;


import java.io.*;



public class SiteCreator {
    public SiteCreator(String websiteName, String author, String javaScript, String css) throws IOException {
        //send to a function that makes html
        String htmlText = htmlMaker(websiteName, author);
        //create the files
        String extension = fileMaker(websiteName, javaScript,css);
        //print the files that were made
        filePrinter(websiteName, javaScript,css);
        //print whatever we need to inside the index.html file
        htmlPrinter(htmlText,extension);

    }

    private void htmlPrinter(String htmlText, String extension) throws FileNotFoundException {
        String fileLocation = extension+"/index.html";
        PrintStream out = new PrintStream(new FileOutputStream(fileLocation));
        System.setOut(out);
        System.out.println(htmlText);
    }

    private void filePrinter(String websiteName, String javaScript, String css) {
        //print out what we created using the strings to print out exactly what we did
        System.out.printf("Created ./website/%s%n", websiteName);
        System.out.printf("Created ./website/%s/index.html%n", websiteName);
        //if we printed css and or java,
        if (javaScript.equals("y"))
        {
            System.out.printf("Created ./website/%s/js/%n", websiteName);
        }
        if (css.equals("y"))
        {
            System.out.printf("Created ./website/%s/css/%n", websiteName);
        }

    }

    private String fileMaker(String websiteName, String javaScript, String css) throws IOException {
        //create the files needed, website/[site name]
        //as well as the html,
        String extension = "data/website/"+websiteName;
        new File (extension).mkdirs();
        File index = new File(extension,"index.html");
        index.createNewFile();

        //and potentially css and js files
        if (javaScript.equals("y"))
        {
            new File(extension,"js").mkdirs();
        }
        if (css.equals("y"))
        {
            new File(extension, "css").mkdirs();
        }
        return extension;
    }

    private String htmlMaker(String websiteName, String author) {
        //take in site name and author, put it in a title and meta tag
        return "<title>"+websiteName+"</title>    <meta>"+author+"</meta>";
    }
}
