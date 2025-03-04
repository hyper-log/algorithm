class Solution {
    public int solution(int n, int t) {
        // 제곱. 세균이 7마리일 경우 한시간엔 14마리. 2시간엔 28마리.
        // 1시간 로직. 7*2 = 14; n*1*2;
        // 2시간 로직. 14*2 = 28; n*2*2;
        // 3시간 로직. 28*2 = 56; n*2*2*2;
        // 4시간 로직. 56*2 = 112; n*2*2*2*2;
        for (int i=0; i<t; i++) { 
             n*=2;
        }
        int answer = n;
        return answer;
    }
}