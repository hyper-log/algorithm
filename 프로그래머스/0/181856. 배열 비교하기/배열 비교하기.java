class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int tmp1 = 0;
            int tmp2 = 0;
            for (int i:arr1) {
                tmp1 += i;
            }
            for (int j:arr2) {
                tmp2 += j;
            }
            if (tmp1 == tmp2) {
                return 0;
            }
            return tmp1 > tmp2 ? 1:-1;
        }
        return arr1.length > arr2.length ? 1:-1;
    }
}