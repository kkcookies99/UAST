class Solution {
public:
    int XXX(int x) {
        if(x == 0) return 0;
        int l = 1, r = x;
        while(l < r)
        {
            int mid = l + (r - l + 1) / 2;
            if(x / mid < mid) r = mid - 1;
            else l = mid;
        }
        return l;
    }
};

