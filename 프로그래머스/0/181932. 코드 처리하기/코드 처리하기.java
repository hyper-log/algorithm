class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        for (int i=0; i<code.length(); i++) {
            String split = code.substring(i, i+1);
            if (split.equals("1")) {
                mode = 1 - mode;
            } else {
                if (mode == 0 && i % 2 == 0) {
                    ret += split;
                } else if (mode == 1 && i % 2 != 0) {
                    ret += split;
                }
            }
            
        }
        return ret.equals("") ? "EMPTY": ret;
    }
}