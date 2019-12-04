package program_3;

import java.io.IOException;
import java.util.Scanner;

public class Program_3 {
    static int factorial (int n){
          if (n != 0)
              return n*factorial(n-1);
          else
              return 1;
          
    }
        public static void main(String[] args) throws IOException{
            System.out.println("Which number would you like to calculate the factorial of?: ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int number = x, result;
            result = factorial(number);
            System.out.println(number + "   The factorial of your number is "+ result);
            
          }
          
}

      
       

      
       

