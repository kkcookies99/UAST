 class Solution {
public:
    int XXX(vector<int>& height) {
        int len=height.size();
        int left=0;
        int right=len-1;
        int maxarea=min(height[left],height[right])*(right-left);
        while(left<right){
            if(height[left]<height[right])
                left++;
            else
                right--;
            maxarea=max(maxarea,min(height[left],height[right])*(right-left)); 
        }
        return maxarea;
    }
};

