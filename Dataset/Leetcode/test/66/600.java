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
                digits[0] = 0;
                int[] res = new int[digits.length + 1];
                for (int i1 = 0; i1 < digits.length; i1++) {
                    res[i1 + 1] = digits[i1];
                }
                res[0] = 1;
                return res;}
                return digits;
        }
        digits[digits.length-1]=digits[digits.length-1]+1;
        return digits;
    }
}

