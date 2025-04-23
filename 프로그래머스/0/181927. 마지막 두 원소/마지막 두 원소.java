class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int beforelast = 0;
        int last = 0;
        for (int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
            beforelast = num_list[num_list.length-2];
            last = num_list[num_list.length-1];
        }
        answer[num_list.length] = beforelast < last ? last-beforelast : last*2;
        return answer;
    }
}