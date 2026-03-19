import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tnpfilehandling {

   // to save data permanently we store data in file
   /*  public static void main(String[] args) {
        //java provides classes to work with files
        //the package (java.io)
        //how to create new file in java
        try{
        File create =new File("Info.txt");
        if (create.createNewFile()){
            System.out.println("file has created " + create);
        }
        else{
            System.out.println("file already exist");
        }
        
    }
    catch(IOException e){
        System.out.println("can not create file");
    }
    
    }
}
 */
//to write file in java  1. FileWriter and 2. BufferWriter are used

/* public static void main(String[] args) {
    try {
        FileWriter Myfile = new FileWriter("data.text");
        Myfile.write("siya nama");
        Myfile.write("pranjal");
        Myfile.close();
        System.out.println("data is written successfully");
    } catch (IOException e) {
        System.out.println("can not write data" + e.getMessage());
    }
}
} */
// wac to save your information in data.txt  information can be like name , enrollemnet and course and branch

    public static void main(String[] args) {

        // --- Writing to file ---
        try {
            FileWriter myFile = new FileWriter("data.txt"); // use .txt not .text
            myFile.write("siya nama\n");
            myFile.write("pranjal\n");
            myFile.close();
            System.out.println("Data is written successfully");
        } catch (IOException e) {
            System.out.println("Cannot write data: " + e.getMessage());
        }

        // --- Reading from file ---
        try {
            BufferedReader myFile = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = myFile.readLine()) != null) {   // corrected condition
                System.out.println(line);
            }

            myFile.close();

        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}
