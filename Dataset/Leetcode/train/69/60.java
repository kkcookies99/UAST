class Solution {
    public int XXX(int x) {
        int left = 0, right = x / 2 + 1;
        int res = 0;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if ((long)mid * mid <= x) {
                res = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return res;
    }
}

