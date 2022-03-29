 class Solution {
public:
    int XXX(vector<int>& height) {
        if(height.size()==0)
        return 0;
        int max=0;
        int min;
        int left=0,right=height.size()-1;
        while(left<right)
        {
            min=height[right]<height[left]?height[right]:height[left];
            if(max>min*(right-left))
            max=max;
            else
            max=min*(right-left);
            if(height[left]<height[right])
            left++;
            else
            right--;
        }
        return max;
    }
};

