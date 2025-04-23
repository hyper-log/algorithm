class Solution {
    public int solution(int n, String control) {
        for (int i=0; i<control.length(); i++) {
            String split = control.substring(i, i+1);
            if (split.equals("w")) {
                n += 1;
            } else if (split.equals("s")) {
                n -= 1;
            } else if (split.equals("d")) {
                n += 10;
            } else if (split.equals("a")) {
                n -= 10;
            }
        }
        return n;
    }
}