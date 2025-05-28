import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger conA = new BigInteger(a);
        BigInteger conB = new BigInteger(b);
        
      
        return String.valueOf(conA.add(conB));
    }
}