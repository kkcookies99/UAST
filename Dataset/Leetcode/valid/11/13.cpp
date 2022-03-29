class Solution {
public:
    int XXX(vector<int>& height) {
        int n = height.size();
        
        int left = 0,right = n - 1;
        int res = 0;
        while(left < right){
            while(left < right && height[left] <= height[right]){
                res = max(res,(right - left) * height[left]);
                left++;
            }
            while(left < right && height[right] < height[left]){
                res = max(res,(right - left) * height[right]);
                right--;
            }
        }

        return res;
    }
};

