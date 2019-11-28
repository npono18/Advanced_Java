
package java_advanced_assignment;
import java.io.File;
import java.util.Scanner;
//import java.io.FileWriter;
//import java.io.BufferedWriter;
import java.util.List;



/**
 *
 * @author S332629690
 */
public class FileWriterClass{
    public static void main(String[] args) throws Exception{
        File file = new File("12345.txt");
        Scanner sc = new Scanner(file);
        //FileWriter fr = new FileWriter("12345.txt");
        //BufferedWriter br = new BufferedWriter(fr);
        //br.write("123456789abcde");
       // br.close();
       // fr.close();
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        String token1 = "";
        Scanner inFile1 = new Scanner(new File("12345.txt")).useDelimeter(",\\s*");
        List<String>data = new ArrayList<String>();
        while (inFile1.hasnext())
            token1 = inFile1.next();
        data.add(token1);
    }
    inFile1.close();
    String[] dataArray = data.toArray(new String[0]);
    for (String s: dataArray){
    System.out.println(s);
}
            
        
    }
