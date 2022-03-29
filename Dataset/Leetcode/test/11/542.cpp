 class Solution {
public:
    int XXX(vector<int>& height) {
        int n=height.size();
        int left=0,right=n-1;
        int area=(right-left)*min(height[left],height[right]);
        while(left<right)
        {
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
            area=max(area,(right-left)*min(height[left],height[right]));
        }
        return area;
    }
};

