 public int[] XXX(int[] digits) {
    int n = digits.length;
    for (int i = n - 1; i >= 0; i--) {
        // 如果 < 9 则 + 1
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        // if = 9 则 归零 继续循环上一位
        digits[i] = 0;
    }
    //如果全是9，则会在数字第一位加1
    int[] result = new int[n + 1];
    result[0] = 1;
    return result;

}

