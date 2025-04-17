import java.util.Scanner;
import java.util.List;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32));
            } else if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32));
            }
        }

        System.out.println(result);
    }
}