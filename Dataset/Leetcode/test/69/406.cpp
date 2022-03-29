class Solution {
public:
    int XXX(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;
        int left = 1, right = x;
        int ans = -1;
        while(left < right)
        {
            int mid = left + ((right - left) >> 1);
            if((long)mid * mid <= x)
            {
                ans = mid;
                left = mid + 1;
            }
            else right = mid;
        }
        return ans;
    }
};

