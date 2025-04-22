class Solution {
    public int solution(int[] num_list) {
        String tmp1 = "";
        String tmp2 = "";
        
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i]%2 == 0) {
                tmp1 += num_list[i];
            }
            if (num_list[i]%2 != 0) {
                tmp2 += num_list[i];
            }
        }
                
        return Integer.parseInt(tmp1) + Integer.parseInt(tmp2);
    }
}