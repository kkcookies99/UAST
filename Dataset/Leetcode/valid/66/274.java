 class Solution {
    public int[] XXX(int[] digits) {
        int last = digits[digits.length - 1];
        if(last < 9) {
            digits[digits.length - 1] = last + 1;
            return digits;
        } else {
            digits[digits.length - 1] = 0;
            for(int i = digits.length - 2; i >= 0; i--) {
                int digit = digits[i];
                if(digit < 9) {
                    digits[i] = digits[i] + 1;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            } 
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res; 
        }
    }
}

