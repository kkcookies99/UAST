 class Solution {
public:
    int XXX(vector<int>& height) {
        int res = 0;
        int n = height.size();
        if(!n) return res;
        int l = 0; int r = n - 1;
        while(l < r)
        {
            int area = (r - l) * min(height[l],height[r]);
            if(height[l] < height[r]) l++;
            else r--;
            res = max(res,area);
        }
        return res;
    }
};

