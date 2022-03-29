class Solution {
public:
    int XXX(vector<int>& height) {
        int left=0,right=height.size()-1;
        int res=0;
        while(left<right){
            res=max(res,(right-left)*min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }
            else right--;
        }
        return res;
    }
};

