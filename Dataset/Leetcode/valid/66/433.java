class Solution {
    public int[] XXX(int[] digits) {
         int last = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + last;
            if (temp > 9) {
                last = 1;
                digits[i] = temp % 10;
            } else {
                digits[i] = temp;
                return digits;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }
}

