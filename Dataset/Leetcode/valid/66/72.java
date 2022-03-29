 class Solution {
    public int[] XXX(int[] digits) {
        int y = 0;
        for (int i = digits.length - 1;i >= 0; i--){
            int k = digits[i];
            if (i == digits.length - 1){
                k = k + 1;
            }
            if (y > 0){
                k = k + y;
                y = 0;
            }
            if (k > 9){
                y = y + 1;
                k = k % 10;
            }
            digits[i] = k;
        }
        if (y > 0){
            int[] digits1 = new int[digits.length + 1];
            for (int i = digits.length - 1; i >= 0; i --){
                digits1[i] = digits[i];
            }
            digits1[0] = y;
            return digits1;
        }
        return digits;
    }
}

