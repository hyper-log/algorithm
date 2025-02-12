class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                int tmp = n/i;
                answer += tmp;
            }
        }
        return answer;
    }
}