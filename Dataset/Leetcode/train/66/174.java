 class Solution {
    public int[] XXX(int[] digits) {
        int up = 1;
        for(int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] + up == 10) {
                digits[i] = 0;
                up = 1;
            } else {
                digits[i]++;
                up = 0;
                break;
            }
        }

        if (up  == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, result.length - 1);
            return result;
        }
        return digits;
    }
}

