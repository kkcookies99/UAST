 class Solution {
public:
    //朴素解法 O(N^2)
    //双指针 两边往中间扫
    int XXX(vector<int>& height) {
        if(height.size()<=1) return 0;
        int l=0,r=height.size()-1;
        int ans=0;
        while(l<r){
            ans=max(ans,min(height[l],height[r])*(r-l));
            if(height[l]<=height[r]) l++;
            else r--;
        }
        return ans;
    }
};

