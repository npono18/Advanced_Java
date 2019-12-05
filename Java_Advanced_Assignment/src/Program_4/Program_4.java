
package Program_4;

import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

public class Program_4 {
    
    public static void main(String[] args) throws IOException{
        try{
            FileWriter writer = new FileWriter("myFile.txt", true);
            writer.write("\r\n");
            writer.write("Apple");
            writer.write("\r\n");
            writer.write("Orange");
            writer.write("\r\n");
            writer.write("Banana");
            writer.write("\r\n");
            writer.write("Apple");
            writer.write("\r\n");
            //Scanner sc = new Scanner(System.in);
            //String input = sc.nextLine();
            //writer.write("Enter your input: ");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
