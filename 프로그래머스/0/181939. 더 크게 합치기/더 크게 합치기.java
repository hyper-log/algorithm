class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = ""+a+b;
        String ba =""+b+a;
        int abint = Integer.parseInt(ab);
        int baint = Integer.parseInt(ba);
        
        if (abint > baint) {
            answer = Integer.parseInt(ab);
        } else if (baint > abint) {
            answer = Integer.parseInt(ba);
        } else {
            answer = Integer.parseInt(ab);
        }
        return answer;
    }
}