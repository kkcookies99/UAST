class Solution {
    public int XXX(int x) {
        if (x <= 0) {
            return x;
        }
        int begin = 1, end = x / 2 + 1;
        while (begin < end) {
            int mid = begin + (end - begin) / 2;
            int t = x / mid;
            if (t == mid) {
                return mid;
            }
            if (t > mid) {
                begin = mid + 1;
            } else {
                end = mid;
            }
        }
        return x / begin < begin ?  begin - 1 : begin;
    }
}

