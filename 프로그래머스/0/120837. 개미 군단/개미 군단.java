class Solution {
    public int solution(int hp) {
        int jant = hp/5;
        int bant = (hp-(jant*5))/3;
        int iant = (hp-(jant*5+bant*3))/1;
        
        return jant+bant+iant;
    }
}