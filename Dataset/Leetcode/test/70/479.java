class Solution {
    public int XXX(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 1;
        ans[1] = 1;
        for (int i = 2; i < n + 1; i++){
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }
}

