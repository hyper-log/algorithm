class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int num = 0;
        for(int i=0; i<numLog.length; i++) {
            if (i==0) {
                num = numLog[0];                
            } else {
                if (numLog[i] == num + 1) {
                    answer += "w";
                    num += 1;
                } else if (numLog[i] == num - 1) {
                    answer += "s";
                    num -= 1;
                } else if (numLog[i] == num + 10) {
                    answer += "d";
                    num += 10;
                } else if (numLog[i] == num - 10) {
                    answer += "a";
                    num -= 10;
                }
            }
        }
        return answer;
    }
}