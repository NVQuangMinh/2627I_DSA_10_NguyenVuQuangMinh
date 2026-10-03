import java.awt.desktop.SystemSleepEvent;
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
    public static void insertionSort1(int n, List<Integer> arr) {
        int i = n;
        int temp = arr.get(i);
        int j = i - 1;
        while (j >= 0 && arr.get(j) > temp) {
            arr.set(j + 1, arr.get(j));
            j--;
            for(int z = 0; z < arr.size(); z++) {
                System.out.print(arr.get(z) + " ");
            }
            System.out.println();
        }
        arr.set(j + 1, temp);
        for(int z = 0; z < arr.size(); z++) {
            System.out.print(arr.get(z) + " ");
        }
        System.out.println();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        Result.insertionSort1(n - 1, arr);
        bufferedReader.close();
    }
}
