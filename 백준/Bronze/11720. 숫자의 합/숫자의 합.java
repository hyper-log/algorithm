import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.next();
        char[] charArray = number.toCharArray();
        int answer = 0;
        for (int i=0; i<charArray.length; i++) {
            answer += charArray[i] - '0';
        }
        
        System.out.println(answer);
    }
    
}