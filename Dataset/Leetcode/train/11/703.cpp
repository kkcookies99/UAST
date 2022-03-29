 class Solution {
public:
    int XXX(vector<int>& height) {
        int n=height.size();
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                res=max(res,min(height[i],height[j])*(j-i));
            }
        }
        return res;
    }
};

