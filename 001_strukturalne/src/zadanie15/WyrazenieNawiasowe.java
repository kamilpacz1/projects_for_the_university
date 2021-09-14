package zadanie15;

import java.util.Scanner;
import java.util.Stack;

public class WyrazenieNawiasowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String a = scanner.nextLine();

        if (areParenthesesOk(a)) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
    }

    private static boolean areParenthesesOk(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);

            if (c == '[' || c == '(' || c == '{') {
                parentheses.push(c);
            } else if (c == ']') {
                if (parentheses.isEmpty()) return false;
                final Character pop = parentheses.pop();
                if (pop != '[') return false;
            } else if (c == ')') {
                if (parentheses.isEmpty()) return false;
                final Character pop = parentheses.pop();
                if (pop != '(') return false;
            } else if (c == '}') {
                if (parentheses.isEmpty()) return false;
                final Character pop = parentheses.pop();
                if (pop != '{') return false;
            }
        }

        return parentheses.isEmpty();
    }
}

