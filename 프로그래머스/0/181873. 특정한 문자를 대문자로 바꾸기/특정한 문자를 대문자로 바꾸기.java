class Solution {
    public String solution(String my_string, String alp) {
        
        String[] tmp = my_string.split("");
        for (int i=0; i<tmp.length; i++) {
            if (tmp[i].equals(alp)) {
                tmp[i] = tmp[i].toUpperCase();
            }
        }
        
        String answer = String.join("", tmp);
        return answer;
    }
}