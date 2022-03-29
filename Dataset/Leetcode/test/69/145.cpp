class Solution {
public:
    int XXX(int x) {
        int left = 0, right = x;
        while (left < right) {
            int mid = (left + right + 1ll) / 2;
            if (mid <= x / mid)
                left = mid;
            else
                right = mid - 1;
        }
        return left;
    }
};



