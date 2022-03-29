class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length, i = len-1, th = 9;
        digits[i] += 1;
        if (digits[i] > th){
            while(i > 0 && digits[i] > th){
                digits[i] = 0;
                digits[--i] += 1;
            }
            if (i == 0 && digits[i] > th){
                digits = new int[len+1];
                digits[0] = 1;
            }
        }
        return digits;
    }
}

