 class Solution {
public:
    int XXX(vector<int>& height) {
        int res = 0;
        int l = 0, r = height.size() - 1, t = min(height[0], height[r]), m ;
        m = height[l] < height[r] ? 1 : 0;
        res = max(res, (r - l) * min(height[l], height[r]));
        while(l < r)
        {
            if(m) l ++ ;
            else r -- ;
            res = max(res, (r - l) * min(height[l], height[r]));
            m = height[l] < height[r] ? 1 : 0;
        }
        return res;
    }
};

