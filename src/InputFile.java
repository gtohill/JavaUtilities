/*
Class is used to open files from path.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
get text form file given path to file. Uses FileReader and BufferedReader to accomplish goal
 */
public class InputFile {

    FileReader file;
    BufferedReader bufferedReader;
    String line = null;
    String filename = "text.txt";
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    // TEST HARNESS
    public static void main(String[] args){
        InputFile file = new InputFile();
    }
}
