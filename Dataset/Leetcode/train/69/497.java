class Solution {
    public int XXX(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x;
        while(left < right) {
            int mid = (left+right)/2;
            if (x/mid == mid) {
                return mid;
            } else if (x/mid > mid) {
                if (x/(mid+1) < (mid+1)) {
                    return mid;
                }
                left = mid+1;
            } else {
                if (x/(mid-1) > (mid-1)) {
                    return mid-1;
                }
                right = mid-1;
            }
        }
        return left;
    }
}

