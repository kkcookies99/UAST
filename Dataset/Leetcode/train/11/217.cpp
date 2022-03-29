class Solution {
public:
    int XXX(vector<int>& height) {
        int n=height.size();
        int res=0;
        int l=0,r=n-1;
        while(l<r)
        {
            int mv=min(height[l],height[r]);
            res=max(res,mv*(r-l));
            //较小的值再去找一个更大的，才可能有机会超过原来的
            if(mv==height[r])
            {
                while(l<r&&height[r]<=mv) r--;
            }
            else
            {
                while(l<r&&height[l]<=mv) l++;
            }
        }
        return res;
    }
};

