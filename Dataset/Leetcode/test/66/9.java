 class Solution {
    public int[] XXX(int[] digits) {
        for(int i = digits.length -1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
                continue;
            }
        }
        int[] p = new int[digits.length+1];
        p[0] = 1;
        return p;
    }
}

