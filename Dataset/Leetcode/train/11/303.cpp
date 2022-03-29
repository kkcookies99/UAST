class Solution {
public:
    int XXX(vector<int>& height) {
        int low = 0;
        int high = height.size()-1;
        int result = 0;
        while(low<high){
            int tmp = min(height[low],height[high])*(high - low);
            result = tmp > result ? tmp:result;
            if(height[low] > height[high]) high--;
            else low++;
        }
        return result;
    }
};

