
package Program_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program_4 {
    
    public static void main(String[] args) throws IOException{
        try{
            FileWriter writer = new FileWriter("myFile.txt", true);
            System.out.println("Enter what you would like to input to the file: ");
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            //writer.write("\r\n");
            //writer.write("I love pie");
            //writer.write("\r\n");
           // writer.write("Good Bye");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
