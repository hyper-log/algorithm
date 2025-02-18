class Solution {
    public int[] solution(long n) {
        String tmp = String.valueOf(n);
        int[] answer = new int[tmp.length()];
        
        for(int i= 0; i<tmp.length(); i++) {
            answer[i] = tmp.charAt(tmp.length() - 1 - i) - '0';
        }
                       
        return answer;
    }
}