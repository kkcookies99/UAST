class Solution {
    public int[] XXX(int[] digits) {
        int c = 1;
        for (int i = digits.length - 1; i >= 0 && c > 0; i--) {
            digits[i] += c;
            c = digits[i] / 10;
            digits[i] %= 10;
        }
        if (c > 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}

