 class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length;
        digits[len-1]++;
        for(int i = len-1; i >= 0; i--){
            if(digits[0] == 10){          //首位需要进位时
                digits = new int[len+1];
                digits[0] = 1;
            }else if(digits[i] == 10){    //其他位需要进位时
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        return digits;
    }
}

