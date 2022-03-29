class Solution {
    public int XXX(int x) {
        int left = 1, right = x;
        int middle = left + (right - left) / 2;
        while (left <= right) {
            middle = left + (right - left) / 2;
            //用x/middle也是防止溢出
            if (middle  == x/middle) return middle;
            else if (middle  > x/middle) right = middle - 1;
            else left = middle + 1;
        }
        return right;
    }
}

