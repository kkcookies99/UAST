class Solution {
    public int[] XXX(int[] digits) {
        int isAdd = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int now = digits[i] + isAdd;
            digits[i] = now % 10;
            isAdd = now / 10;
            if (isAdd != 1) {
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

