class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int x=1;
        int add=0;
        for (int i=0; i<num_list.length; i++) {
            x *= num_list[i];
            add += num_list[i];
        }
        add = add*add;
        answer = x>add ? 0 : 1;
        return answer;
    }
}