import java.util.Scanner;
import java.util.Stack;

public class w3_tailop_25021882 {
    static int precedent(char c) {
        if (c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' '){
                continue;
            }
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if(c == '('){
                stack.push(c);
            }
            else if (c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                while(!stack.isEmpty() && precedent(stack.peek()) > precedent(c)){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        System.out.println(result.toString());
    }
}
