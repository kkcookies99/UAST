 class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += digits[i];
        }
        if(sum == len*9){
            int[] newarr = new int[len+1];
            newarr[0] = 1;
            return newarr;
        }

        digits[len-1]++;
        for (int i = len-1; i >= 0; i--) {
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        return digits;
    }
}

