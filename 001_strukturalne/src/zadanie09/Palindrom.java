package zadanie09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {
    public static void main(String[] args) {
        char[] str = new char[100];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String string = bufferedReader.readLine();
            for (int i = 0; i < string.length(); i++) {
                str[i] = string.charAt(i);
            }

            if (isPalindrome(str, string.length())) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPalindrome(char[] str, int n) {
        for (int i = 0; i < (n / 2); ++i) {
            if (str[i] != str[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
