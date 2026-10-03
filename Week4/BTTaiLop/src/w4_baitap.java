import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class w4_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        List<Integer> arr = new ArrayList();
        int h = 0;
        for(int i = 0; i < l; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr, Collections.reverseOrder());
        for (int i = 1; i <= l; i++) {
            if(arr.get(i - 1) >= i) {
                h += 1;
            } else {
                break;
            }
        }
        System.out.println(h);
    }
}