class Solution {
public:
    int maxContain(vector<int> height,int x,int y)
    {
        return min(height[x],height[y])*(y-x);
    }
    int XXX(vector<int>& height) {
        int n=height.size();
        int ans=0;
        int left=0,right=n-1;
        while(right>left)
        {
            //ans=max(ans,maxContain(height,left,right));
            int t=min(height[left],height[right])*(right-left);
            ans=max(ans,t);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return ans;
    }
};

