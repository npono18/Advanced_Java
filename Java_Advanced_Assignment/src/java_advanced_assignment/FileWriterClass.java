    package java_advanced_assignment;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class FileWriterClass{

    public static void main(String[] args) throws IOException{
       
        int lines;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\nickp\\Documents\\NetBeansProjects\\Advanced_Java\\Advanced_Java\\Java_Advanced_Assignment\\src\\java_advanced_assignment\\12345.txt"))) {
            lines = 0;
            while (reader.readLine() != null)
                lines++;
        }
        
        final int SIZE = lines;
        int[] numbers = new int[SIZE];
        //int result, searchValue;
        
        int index = 0;
        
        File file = new File("C:\\Users\\nickp\\Documents\\NetBeansProjects\\Advanced_Java\\Advanced_Java\\Java_Advanced_Assignment\\src\\java_advanced_assignment\\12345.txt");
        Scanner inputFile = new Scanner(file);
        bubbleSort(numbers);
        while (inputFile.hasNextInt() && index < numbers.length){
            numbers[index] = inputFile.nextInt();
            System.out.println(numbers[index]);
            index++;      }
        
        FileWriterClass ob = new FileWriterClass();
         int arr[] = numbers;
         FileWriterClass.bubbleSort(arr);
         System.out.println("Sorted Text File:");
         ob.printArray(arr);
    }
    
    static  void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1;i++)
            for(int j = 0; j<n-i-1; j++)
                if (arr[j] > arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }        
}    
    void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; ++i)
            System.out.println(arr[i] + "");
        System.out.println();
        
    }
}

