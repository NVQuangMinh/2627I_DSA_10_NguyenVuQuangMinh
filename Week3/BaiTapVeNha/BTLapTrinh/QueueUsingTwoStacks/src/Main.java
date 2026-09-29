import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Stack stackIn = new Stack();
        Stack stackOut = new Stack();
        for (int i = 0; i < N; i++) {
            String[] query = sc.nextLine().split(" ");
            if (query[0].equals("1")) {
                stackIn.push(Integer.parseInt(query[1]));
            } else if (query[0].equals("2")) {
                if (stackOut.isEmpty()) {
                    while (!stackIn.isEmpty()) {
                        stackOut.push(stackIn.pop());
                    }
                }
                stackOut.pop();
            } else if (query[0].equals("3")) {
                if (stackOut.isEmpty()) {
                    while (!stackIn.isEmpty()) {
                        stackOut.push(stackIn.pop());
                    }
                }
                System.out.println(stackOut.peek());
            }
        }
    }
}
