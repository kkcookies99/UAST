 class Solution {
    public int[] XXX(int[] digits) {
        int n = digits.length;
        for (int i = n-1;i>=0;i--){
            if(digits[i]+1<10) {
                digits[i]+=1;
                break;
            }
            else{
                digits[i] = 0;
            }
        }
        if(digits[0]==0) {
            int[] ans = new int[n + 1];
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}

