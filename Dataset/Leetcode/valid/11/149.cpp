class Solution {
public:
    int XXX(vector<int>& height) {
        int r = height.size()-1;
        int l = 0;
        int ret = 0;
        while(l<r){
            if(height[l]<=height[r]){
                ret = max(ret,height[l]*(r-l));
                l++;
            }else if(height[l]>height[r]){
                ret = max(ret,height[r]*(r-l));
                r--;
            }
        }
        return ret;
    }
};

