 class Solution {
public:
    int XXX(vector<int>& height) {
        int i=0,j=height.size()-1;
        int res=0;
        while(i<j)
        {
            res=max(res,min(height[i],height[j])*(j-i));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return res;
    }
};

