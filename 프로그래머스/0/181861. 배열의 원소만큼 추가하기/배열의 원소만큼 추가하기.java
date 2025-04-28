import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> tmp = new ArrayList();
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i]; j++) {
                tmp.add(arr[i]);
            }
        }
        int[] answer = new int[tmp.size()];
        int index = 0;
        for (int i:tmp) {
            answer[index] = i;
            index++;
        }
        
        return answer;
    }
}