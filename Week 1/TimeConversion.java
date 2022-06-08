import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    
       
       // Format of the date defined in the input String
        DateFormat dateFormat
            = new SimpleDateFormat("hh:mm:ssaa");
       
        // Change the pattern into 24 hour format
        DateFormat format
            = new SimpleDateFormat("HH:mm:ss");
        Date time = null;
        String output = "";
        
         try {
             // Converting the input String to Date
            time = dateFormat.parse(s);
            
            // Changing the format of date
            // and storing it in
            // String
            output = format.format(time);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        // Converting the input String to Date
        
       

        return output;

    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
