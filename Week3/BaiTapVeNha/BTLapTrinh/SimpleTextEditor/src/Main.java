import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Stack arrayStack = new Stack();
        Stack queryIn = new Stack();
        for (int i = 0; i < N; i++) {
            String[] query = sc.nextLine().split(" ");
            String command = query[0];
            if (command.equals("1")) {
                queryIn.push(query[0] + " " + query[1]);
                for (int j = 0; j < query[1].length(); j++) {
                    arrayStack.push(String.valueOf(query[1].charAt(j)));
                }
            } else if (command.equals("2")) {
                int k = Integer.parseInt(query[1]);
                StringBuilder deleted = new StringBuilder();
                for (int j = 0; j < k; j++) {
                    String s = (String) arrayStack.pop();
                    deleted.append(s);
                }
                queryIn.push(query[0] + " " + deleted.toString());
            } else if (command.equals("3")) {
                System.out.println(arrayStack.get(Integer.parseInt(query[1]) - 1));
            } else if (command.equals("4")) {
                String[] previous = ((String) queryIn.pop()).split(" ");
                String preCommand = previous[0];
                if (preCommand.equals("1")) {
                    for (int j = 0; j < previous[1].length(); j++) {
                        arrayStack.pop();
                    }
                } else if (preCommand.equals("2")) {
                    for (int j = previous[1].length() - 1; j >= 0; j--) {
                        arrayStack.push(String.valueOf(previous[1].charAt(j)));
                    }
                }
            }
        }
    }
}
