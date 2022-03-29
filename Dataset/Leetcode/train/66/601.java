class Solution {
    public int[] XXX(int[] digits) {
 if (digits[digits.length-1]+1==10) {
            digits[digits.length - 1]=10;
            for (int i = digits.length - 1; i > 0; i--) {
                    if (digits[i]==10) {
                    digits[i] = 0;
                    digits[i-1] =digits[i-1]+1;
                }
            }
            if (digits[0] == 10) {
                digits=new int[digits.length+1];
                digits[0]=1;
               }
                return digits;
        }
        digits[digits.length-1]=digits[digits.length-1]+1;
        return digits;
    }
}

