 class Solution {
    public int[] XXX(int[] digits) {
        if (digits[digits.length - 1] + 1 < 10) {
            digits[digits.length - 1]++;
            return digits;
        }
        //最后一位大于等于10，需要考虑进位
        boolean flag = false;
        if (digits.length >= 2 && digits[0] + 1 >= 10 && digits[1] + 1 >= 10) {
            flag = true;
        } else if (digits.length == 1 && digits[0] == 9) {
            flag = true;
        }
        digits[digits.length - 1]++;
        //考虑是否数组扩容
        int[] answer = flag ? new int[digits.length + 1] : new int[digits.length];
        int n = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int remainder = (digits[i] + n) % 10;
            if (flag) answer[i + 1] = remainder;
            else answer[i] = remainder;
            n = (digits[i] + n) / 10;
        }
        answer[0] = flag ? n : answer[0];
        return answer;
    }
}

