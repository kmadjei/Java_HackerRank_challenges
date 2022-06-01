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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
       // int max = Collections.max(arr);
        //int min = Collections.min(arr);
        
        Collections.sort(arr);
        long maxSum = 0;
        long miniSum = 0;

        for (int i = 0; i<5; i++) {
            if(i !=0 ){
                maxSum += arr.get(i); 
            }
            
            if (i != 4) {
                miniSum += arr.get(i);
            }
        }
         
        
        
        System.out.println(miniSum + " " + maxSum);

    }

}

public class mini_max_sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

/*abstract

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

*/