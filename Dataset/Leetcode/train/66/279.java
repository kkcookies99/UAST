 class Solution {
    public int[] XXX(int[] digits) {
        // 最后一位小于9，最后一位+1直接返回
        if (digits[digits.length - 1] < 9) digits[digits.length - 1]++;
        else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++; return digits;
                }
                else digits[i] = 0;
            }
            // 产生进位
            if (digits[0] == 0) {
                int[] res = new int[digits.length + 1];
                res[0] = 1; res[1] = 0;
                return res;
            }
        }
        return digits;
    }
}

