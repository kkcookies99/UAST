 class Solution {
    public int[] XXX(int[] digits) {
        int n = digits.length;
        int[] tmp = Arrays.copyOf(digits, n);
        int carry = 0;
        for(int i = n - 1 ; i >= 0 ; i--){
            if(i == n - 1){
                tmp[i] += 1;
                if(tmp[i] > 9){
                    carry = tmp[i] / 10;
                    tmp[i] -= carry * 10;
                    continue;
                }
            }
            if(carry > 0){
                tmp[i] += carry;
                carry = 0;
            }
            if(tmp[i] > 9){
                carry = tmp[i] / 10;
                tmp[i] -= carry * 10;
            }
        }
        if(carry > 0){
            int[] ans = new int[n + 1];
            ans[0] = carry;
            for(int i = 1 ; i <= n ; i++){
                ans[i] = tmp[i-1];
            }
            return ans;
        }
        return tmp;
    }
}