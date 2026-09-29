import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int h: h1) {
            sum1 += h;
        }
        for (int h: h2) {
            sum2 += h;
        }
        for (int h: h3) {
            sum3 += h;
        }
        int i1 = 0, i2 = 0, i3 = 0;
        int n1 = h1.size(), n2 = h2. size(), n3 = h3.size();
        while (i1 < n1 && i2 < n2 && i3 < n3) {
            if (sum1 == sum2 && sum2 == sum3){
                return sum1;
            }
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= h1.get(i1++);
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= h2.get(i2++);
            } else if (sum3 >= sum2 && sum3 >= sum1) {
                sum3 -= h3.get(i3++);
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
        List<Integer> h3 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            h1.add(sc.nextInt());
        }
        for (int i = 0; i < n2; i++) {
            h2.add(sc.nextInt());
        }
        for (int i = 0; i < n3; i++) {
            h3.add(sc.nextInt());
        }
        System.out.println(equalStacks(h1, h2, h3));
    }
}
