import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class TextFileModificationProgram
{    
    public int modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
        int count = 0;
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
            String str = oldContent;
            String findStr = oldString;
            int lastIndex = 0;
            

            while(lastIndex != -1){

                lastIndex = str.indexOf(findStr,lastIndex);

                if(lastIndex != -1){
                    count ++;
                    lastIndex += findStr.length();
                }
            }
            System.out.println(count);
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        return count;
    }
     
    public static void main(String[] args)
    {
    	TextFileModificationProgram modifyFile= new TextFileModificationProgram();
    	modifyFile.modifyFile("C:/Users/Balaji Katari/Desktop/Test.txt", "Rajesh", "Balaji");
         
        System.out.println("done");
       
        
    }
}