 class Solution {
public:
    int XXX(vector<int>& height) {
        int i=0,j = height.size()-1;
        int ans = 0;
        while(i<j){
            ans = max(ans,min(height[i],height[j])*(j-i));
            if (height[i]>height[j]) j--;
            else i++;
        }
        return ans;
    }
};

