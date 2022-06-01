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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
        double positiveCounter, negative_counter, zeroCounter;
        positiveCounter = negative_counter = zeroCounter = 0;

        for(int i: arr) {
            if (i > 0) {
                positiveCounter +=1;
            } else if( i < 0) {
                negative_counter+=1;
            } else {
                zeroCounter+=1;
            }
        }
                
        BigDecimal pr, nr, zr;
        
        pr = new BigDecimal(Double.toString(positiveCounter/arr.size()));
        pr = pr.setScale(6, RoundingMode.HALF_EVEN);
        nr = new BigDecimal(Double.toString(negative_counter/arr.size()));
        nr = nr.setScale(6, RoundingMode.HALF_EVEN);
        zr = new BigDecimal(Double.toString(zeroCounter/arr.size()));
        zr = zr.setScale(6, RoundingMode.HALF_EVEN);
        
        System.out.println(pr);
        System.out.println(nr);
        System.out.println(zr);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
