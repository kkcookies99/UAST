class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length;
        int cur = 1;
        for(int i = len - 1; i >= 0; i--){
            if(cur > 0){
                digits[i] += cur;
                cur = digits[i] / 10;
                digits[i] %= 10;
            }else break; 
        }
        if(cur > 0){
            int[] res = new int[len+1];
            res[0] = 1;
            return res;
        }else return digits;
    }
}

