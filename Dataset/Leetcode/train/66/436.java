class Solution {
    public int[] XXX(int[] digits) {
        int n = digits.length - 1;
        while (n >= 0) {
            if (digits[n] != 9) {
                digits[n]++;
                return digits;
            } else {
                digits[n] = 0;
                n = n - 1;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }
}

