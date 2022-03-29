 class Solution {
    public int[] XXX(int[] digits) {
        int length = digits.length;
        boolean flag = true;
        for(int d : digits){
            if(d != 9) flag = false;
        }
        for(int i = length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                break;
            }else if(digits[i] == 9){
                digits[i] = 0;
            }
        }
        if(flag){
            int[] ans = new int[digits.length + 1];
            Arrays.fill(ans, 0);
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}

