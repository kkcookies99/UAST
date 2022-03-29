 class Solution {
    public int[] XXX(int[] digits) {
        boolean flag = false; // 进位标识
        ++digits[digits.length-1];
        for (int i=digits.length-1; i>=0; --i){
            if (flag) ++digits[i];      // 进位
            flag = (digits[i] > 9);    // 下一位是否进位
            if (flag) digits[i] -= 10;
        }
        if (flag){  // 位数+1
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            for (int i=0; i<digits.length; ++i){
                ans[i+1] = digits[i];
            }
            return ans;
        }
        return digits;
    }
}

