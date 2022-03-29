class Solution {
public:
    int XXX(int x) {
        int l = 0;
        int r = x / 2 + 1;  //针对x = 1的情况
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (mid <= x / mid) l = mid;
            else    r = mid - 1;
        }
        return l;
    }
};

