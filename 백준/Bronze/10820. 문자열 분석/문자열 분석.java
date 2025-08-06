import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            char[] s = line.toCharArray();
            int number = 0;
            int up = 0;
            int lower = 0;
            int blank = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= '0' && s[j] <= '9') {
                    number++;
                } else if (s[j] >= 'A' && s[j] <= 'Z') {
                    up++;
                } else if (s[j] >= 'a' && s[j] <= 'z') {
                    lower++;
                } else if (s[j] == ' ') {
                    blank++;
                }
            }
            System.out.println(lower + " " + up + " " + number + " " + blank);
        }
    }
}