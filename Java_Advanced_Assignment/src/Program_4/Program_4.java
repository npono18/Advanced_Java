
package Program_4;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Program_4 {
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items you plan to inventory: ");
        int numOfItems = Integer.parseInt(sc.nextLine());
        String arrayOfItems[] = new String[numOfItems];
        for (int i = 0; i<arrayOfItems.length; i++){
            System.out.println("Enter the item name "+ (i+1)+ " : ");
            arrayOfItems[i] = sc.nextLine();
        }
        System.out.println("Based on your input, this is your inventory: ");
        for (int i = 0; i < arrayOfItems.length; i++){
            System.out.println("Item "+ (i+1)+ ": " + arrayOfItems[i]);
        }
        try{
            FileWriter writer = new FileWriter("C:\\Users\\nickp\\Documents\\NetBeansProjects\\Advanced_Java\\Advanced_Java\\Java_Advanced_Assignment\\src\\Program_4\\myFile.txt", true);
            for (int x = 0; x<arrayOfItems.length; x++){
                for (int j = 0; j<arrayOfItems.length; j++){
                //writer.write(arrayOfItems[x][j]);
            }
        }
            writer.write("\r\n");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    }
 

