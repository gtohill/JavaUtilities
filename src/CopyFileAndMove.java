
/*
copy file from directory A then make a copy an move to directory B
must download apache FileUtils at http://commons.apache.org/proper/commons-io/
 */

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;


public class CopyFileAndMove {

    public static void main(String[] args){
        File source = new File("text.txt");
        File dest = new File("/path/to/destination/");
        try{
            FileUtils.copyFileToDirectory(source, dest);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }



}
