 class Solution {
    public int[] XXX(int[] digits) {
        int flag = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            if (i == digits.length-1) digits[i] += 1;
            if (flag == 1) digits[i] += 1;
            if (digits[i] > 9){
                flag = 1;
                digits[i] -= 10;
            }else {
                flag = 0;
            }
        }
        int[] ans;
        if (flag == 1){
             ans = new int[digits.length+1];
            ans[0] = 1;
            for (int i = 1; i <ans.length; i++) {
                ans[i] = digits[i-1];
            }
        }else {
            ans = new int[digits.length];
            for (int i = 0; i <ans.length; i++) {
                ans[i] = digits[i];
            }
        }
        return ans;
    }
}

