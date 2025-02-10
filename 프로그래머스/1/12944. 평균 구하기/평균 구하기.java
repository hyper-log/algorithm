class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int tmp = 0;
        for (int i : arr) {
            tmp += i;
        }
        answer = (double) tmp / arr.length;
        return answer;
    }
}