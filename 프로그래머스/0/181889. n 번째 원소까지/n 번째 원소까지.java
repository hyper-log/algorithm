class Solution {
    public int[] solution(int[] num_list, int n) {
        int indexLength = num_list.length - n;
        int[] answer = new int[num_list.length-indexLength];
        int index = 0;
        for (int i=0; i<n; i++) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}