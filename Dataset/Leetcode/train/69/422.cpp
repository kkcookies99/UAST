class Solution {
public:
    int XXX(int x) {
        if(x == 1) return 1;
        int l = 0; int r = 1e5;
        while(r - l >= 1) 
        {
            int mid = (l + r + 1) / 2;
            if(mid == (x / mid)) return mid;
            if(mid <= (x / mid)) l = mid ;
            else r = mid - 1;
        }
        return l;
    }
};

