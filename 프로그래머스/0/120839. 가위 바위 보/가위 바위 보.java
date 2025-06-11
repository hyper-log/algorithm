class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i=0; i<rsp.length(); i++) {
            int one = Integer.parseInt(rsp.substring(i, i+1));
            if (one == 0) {
                answer += "5";
            } else if (one == 5) {
                answer += "2";
            } else {
                answer += "0";
            }
            
        }
        return answer;
    }
}