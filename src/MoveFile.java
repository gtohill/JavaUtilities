import java.io.File;
/*
move file from directory A to Directory B. Change the paths below to test.
 */
public class MoveFile{

        public static void main(String[] args)
        {
            try{

                File afile = new File("/folderA//textA.txt");

                if(afile.renameTo(new File("/folderB/" + afile.getName()))){
                    System.out.println("File is moved successful!");
                }else{
                    System.out.println("File is failed to move!");
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

