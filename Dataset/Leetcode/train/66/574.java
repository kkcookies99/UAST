class Solution {
    public int[] XXX(int[] digits) {
        if (isNeedAddElement(digits)) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        int[] res = new int[digits.length];
        int add = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + add;
            res[i] = num % 10;
            add = num / 10;
        }
        return res;
    }

    private boolean isNeedAddElement(int[] digits) {
        for (int digit : digits) {
            if (digit != 9) {
                return false;
            }
        }
        return true;
    }
}

