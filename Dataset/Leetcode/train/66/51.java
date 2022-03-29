 class Solution {
    public int[] XXX(int[] digits) {
        // 进位
        int ac = 1;
        int[] ans = new int[digits.length+1];
        for (int i=digits.length-1; i>=0; --i) {
            ans[i+1] = (digits[i] + ac)%10;
            ac = (digits[i] + ac)/10;
        }
        if(ac == 0){
            return Arrays.copyOfRange(ans,1,ans.length);
        }else {
            ans[0] = ac;
            return ans;
        }
    }
}

