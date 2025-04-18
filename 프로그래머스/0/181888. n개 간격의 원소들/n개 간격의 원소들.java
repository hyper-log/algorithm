class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (int) Math.ceil((double) num_list.length / n);
        int[] answer = new int[size];
        int index = 0;
        for (int i=0; i<num_list.length; i+=n) {
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}