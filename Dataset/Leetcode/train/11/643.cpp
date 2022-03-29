 class Solution {
public:
    int XXX(vector<int>& height) {
        int n = height.size();
        int ans = 0;
        int left = 0,right = n-1;
        while(left<right){
            ans = max(ans,min(height[left],height[right])*(right-left));
            height[left]>height[right]?right--:left++;
        }
        return ans;
        
    }
};

