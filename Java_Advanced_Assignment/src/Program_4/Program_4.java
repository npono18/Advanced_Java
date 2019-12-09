
package Program_4;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Program_4 {
    
    public static void main(String[] args) throws IOException{
      Scanner sc = new Scanner(System.in);
      String[] array = new String[10];
      System.out.println("Please enter the items you would like to inventory: ");
      System.out.println("You can enter a maximum of 10 items: ");
      for (int i = 0; i < array.length; i++){
          array[i]  = sc.nextLine();
      }
     BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\nickp\\Documents\\NetBeansProjects\\Advanced_Java\\Advanced_Java\\Java_Advanced_Assignment\\src\\Program_4\\myFile.txt"));
     writer.write(array[0]);
     writer.write("\r\n");
     writer.write(array[1]);
     writer.write("\r\n");
     writer.write(array[2]);
     writer.write("\r\n");
     writer.write(array[3]);
     writer.write("\r\n");
     writer.write(array[4]);
     writer.write("\r\n");
     writer.write(array[5]);
     writer.write("\r\n");
     writer.write(array[6]);
     writer.write("\r\n");
     writer.write(array[7]);
     writer.write("\r\n");
     writer.write(array[8]);
     writer.write("\r\n");
     writer.write(array[9]);
     writer.write("\r\n");
     writer.close();
     
     File file  = new File("C:\\Users\\nickp\\Documents\\NetBeansProjects\\Advanced_Java\\Advanced_Java\\Java_Advanced_Assignment\\src\\Program_4\\myFile.txt");
     String[] words;
     words = null;
     try (FileReader FR = new FileReader(file)) {
         BufferedReader BR = new BufferedReader(FR);
         String s;
         Scanner sc2 = new Scanner(System.in);
         String wordSearch = sc2.nextLine();
         String input = wordSearch;
         int count = 0;
  /////////////////////////////       
         BR = null;
         writer  = null;
         ArrayList<String> lines = new ArrayList<String>();
         try{
             BR = new BufferedReader(new FileReader("C:\\Users\\nickp\\Documents\\NetBeansProjects\\Advanced_Java\\Advanced_Java\\Java_Advanced_Assignment\\src\\Program_4\\myFile.txt"));
             String currentLine = BR.readLine();
             while (currentLine != null){
                 lines.add(currentLine);
                 currentLine = BR.readLine();
             }
             Collections.sort(lines);
             writer = new BufferedWriter(new FileWriter("C:\\Users\\nickp\\Documents\\NetBeansProjects\\Advanced_Java\\Advanced_Java\\Java_Advanced_Assignment\\src\\Program_4\\myFile.txt"));
             for (String line : lines){
                 writer.write(line);
                 writer.newLine();
             }
             
         }
         catch (IOException e){
             e.printStackTrace();
         }
         finally{
             try{
                 if (BR != null){
                     BR.close();
                 }
                 if (writer != null){
                     writer.close();
                 }
             }
             catch (IOException e){
                 e.printStackTrace();
             }
         }
         
  
         }
        System.out.println("You can check the text file for the alphabetically organized list of items");

     }

     
    }

