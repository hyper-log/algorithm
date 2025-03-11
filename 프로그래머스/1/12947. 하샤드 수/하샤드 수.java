class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String convertInt = String.valueOf(x);
        int tmp = 0;
        for (int i=0; i<convertInt.length(); i++) {
            tmp += Integer.parseInt(convertInt.substring(i, i+1));
        }
        
        if (x%tmp == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}