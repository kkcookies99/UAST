 class Solution {
public:
    int XXX(vector<int>& height) {
        int res = 0;
        int l = 0, r = height.size() - 1, t = min(height[0], height[r]), m ;
        int ll = height[l], rr = height[r];
        res = max(res, (r - l) * min(height[l], height[r]));
        m = height[l] < height[r] ? 1 : 0;
        while(l < r)
        {
            if(m)
            {
                while(l < r && height[++ l] <= ll);
                ll = height[l];
            }
            else
            {
                while(l < r && height[-- r] <= rr);
                rr = height[r];
            }
            m = height[l] < height[r] ? 1 : 0;
            res = max(res, (r - l) * min(height[l], height[r]));
        }
        return res;
    }
};

