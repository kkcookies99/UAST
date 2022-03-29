class Solution {
    public int[] XXX(int[] digits) {
        boolean isSameNum = true;
        for (int d : digits) {
           if (d != 9) {
                isSameNum = false;
           }
        }
        if (isSameNum) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        int len = digits.length;
        int digit = digits[len - 1];
        if (digit != 9) {
            digits[len - 1] = digits[len - 1] + 1;
        } else {
            digits[len - 1] = 0;
            if (len > 1) {
                int[] newArray = new int[len - 1];
                System.arraycopy(digits, 0, newArray, 0, len - 1);
                int[] ints = XXX(newArray);
                System.arraycopy(ints, 0, digits, 0, ints.length);
            }
        }
        return digits;
    }
}

