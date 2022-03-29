class Solution {
    public int XXX(int x) {
        int l = 0, r = x, ans = 0;
        while (l <= r) {
            int mid = (l + r )/ 2;
            if ((double)mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }
}

