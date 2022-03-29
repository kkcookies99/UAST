class Solution {
    public int XXX(int x) {
        if (x == 0) return 0;
        int left = 1, right = x / 2;
        while (left < right) {
            // 取中位数的上界，否则会死循环
            int mid = left + (right - left + 1) / 2;
            if (mid <= x / mid) left = mid;
            else right = mid - 1;
        }
        return left;
    }
}

