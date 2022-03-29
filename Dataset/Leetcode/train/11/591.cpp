 class Solution {
public:
    int XXX(vector<int>& height) {
        int l=0, r=height.size()-1, max_v=0;
        while(l<r){
            int v=(height[l]<height[r]?height[l]:height[r])*(r-l);
            max_v=(max_v>v?max_v:v);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return max_v;
    }
};

