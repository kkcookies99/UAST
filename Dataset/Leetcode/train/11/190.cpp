class Solution {
public:
    int XXX(vector<int>& height) {
        int n = height.size();
        if(n == 0 || n == 1) return 0;
        int low = 0, high = n - 1;
        int ans = min(height[low], height[high]) * (n - 1);
        while(low < high){
            if(min(height[low], height[high]) * (high - low) > ans)
                ans = min(height[low], height[high]) * (high - low);
            if(height[low] > height[high]) high--;
            else low++;
        }
        return ans;  
    }
};

