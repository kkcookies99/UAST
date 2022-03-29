class Solution {
public:
    int XXX(vector<int>& height) {
        int n=height.size(),i=0,j=n-1,res=INT_MIN;
        while(i<j){
            res=max(res,min(height[i],height[j])*(j-i));
            if(height[i]>height[j])
                j--;
            else
                i++;
        }
        return res;
    }
};

