class Solution {
public:
    int XXX(vector<int>& height) {
        int l=0,r=height.size()-1;
        int ans=0;
        while(l<r){
            ans=max((r-l)*min(height[l],height[r]),ans);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
};

