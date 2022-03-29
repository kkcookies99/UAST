class Solution {
    public int XXX(int x) {
        int left = 0;
        int right = x;
        while(left < right) {
            int mid = (left+right)/2;
            if (x == (long)mid*mid) {
                return mid;
            } else if (x > (long)mid *mid) {
                if (x < (long)(mid+1)*(mid+1)) {
                    return mid;
                }
                left = mid+1;
            } else {
                if (x > (long)(mid-1)*(mid-1)) {
                    return mid-1;
                }
                right = mid-1;
            }
        }
        return left;
    }
}

