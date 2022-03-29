class Solution {
    public int XXX(int x) {
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            } else if (sqrt > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}

