 class Solution {
public:
    int XXX(vector<int>& height) {
        int n=height.size();
        int max1=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int add=i-j;
                max1=max(max1,(add*min(height[i],height[j])));
            }
        }
        return max1;
    }
};

