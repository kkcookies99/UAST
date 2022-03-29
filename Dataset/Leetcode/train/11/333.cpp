class Solution {
public:
    int XXX(vector<int>& height) {
        int n = height.size();
        if(n < 2){
            return 0;
        }
        int left = 0; 
        int right = n - 1;
        int res = 0;
        while(left < right){
            int h = min(height[left], height[right]);
            res = max(res, h*(right-left));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
};

