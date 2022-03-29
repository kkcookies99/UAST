class Solution {
    public int XXX(int n) {
        if(n==1){
            return 1;
        }
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 2;
        for (int i=2;i<=n-1;i++){
            ans[i] = ans[i-1]+ans[i-2];
        }
        return ans[n-1];
    }
}

