 class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length;

        for (int i = len - 1; i >= 0; i--) {

            len = digits.length;

            if (digits[i] == 9 && i > 0) {
                digits[i] = 0;
                continue;
            } else if (digits[i] == 9 && i == 0) {
                int[] result = new int[len+1];
                result[0] = 1;
                digits = result;
            } else {
                digits[i] += 1;
                break;
            }
        }

        return digits;
    }
}