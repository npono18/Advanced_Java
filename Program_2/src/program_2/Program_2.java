
package program_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program_2 {
    
    public static void main(String[] args) throws IOException {
        File file = new File("123456.txt");
        String[] words = null;
        FileReader FR = new FileReader(file);
        BufferedReader BR = new BufferedReader(FR);
        String s;
            System.out.print("Which word would you like to look for?: ");
            Scanner sc = new Scanner(System.in);
            String wordSearch = sc.nextLine();
        String input = wordSearch;
        int count = 0;
        while ((s = BR.readLine())!=null){
            words = s.split(" ");
            for (String word : words){
                if (word.equals(input)){
                    count++;
                }
                
            }
    }
            if(count!=0){
                System.out.println("The given word is present for "+count+" times");
                
            }
            else{
                System.out.println("The given word is not present in the text file");
            }
            FR.close();
        
    }
    
}
