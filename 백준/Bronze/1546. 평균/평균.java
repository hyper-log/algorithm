import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        long max = 0;
        long sum = 0;
        for (int i=0; i<n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
        }
        double answer = (double) sum * 100 / max / n;
        System.out.println(answer);
    }
    
}