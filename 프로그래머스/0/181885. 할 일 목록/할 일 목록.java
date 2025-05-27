import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        List<Integer> todo = new ArrayList<>();
        int temp = 0;
        for (int i=0; i<finished.length; i++) {
            if (finished[i] == false) {
                temp++;
                todo.add(i);
            }
        }
        
        String[] answer = new String[temp];
        int index = 0;
        for (int i:todo) {
            answer[index] = todo_list[i];
            index++;
        }
        return answer;
    }
}