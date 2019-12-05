
package Program_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

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
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        String[] words;
        words = null;
        try (FileReader FR = new FileReader(file)){
            BufferedReader BR = new BufferedReader (FR);
            String s;
            System.out.println("Which item would you like to search for:?" );
            Scanner sc = new Scanner(System.in);
            
        }
    }
}
