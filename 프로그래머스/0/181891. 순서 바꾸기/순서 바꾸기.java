import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        List<Integer> first = new ArrayList<>();        
        for(int i=0; i<n; i++) {
            first.add(num_list[i]);
        }
        List<Integer> sec = new ArrayList<>();
        for(int i=n; i<num_list.length; i++) {
            System.out.println(num_list[i]);
            sec.add(num_list[i]);
        }
        for(int i:first) {
            sec.add(i);
        }
        int index = 0;
        for (int i:sec) {
            answer[index++] = i;
        }
        return answer;
    }
}