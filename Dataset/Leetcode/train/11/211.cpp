class Solution {
public:
    int XXX(vector<int>& height) {
        int low=0,high=height.size()-1,mx=0;
        while( low<high ){
            mx=max( mx,(high-low)*min(height[low],height[high]) ); 
            height[low]>height[high]?high--:low++;            
        }
        return mx;
    }
};

