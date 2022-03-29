class Solution {
    public int XXX(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (x / mid >= mid) {
                if (x / (mid + 1) < (mid + 1)) {
                    return mid;  // 夹逼准则
                } else {
                    left = mid + 1; // left 更新
                }
            } else {
                right = mid; // right 更新 ！！！！！
            }
        }
        return left;
    }
}

