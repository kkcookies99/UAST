 class Solution {
    public int[] XXX(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int x = digits[i] + 1;
            if (x <= 9) {
                digits[i] = x;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}

