class Solution {
    public int XXX(int x) {
        int left = -1;
        int right = x;
        while (left < right) {
            int mid = (((right ^ left) + 1) >> 1) + (right & left);
            if ((long)mid * mid <= x) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}

