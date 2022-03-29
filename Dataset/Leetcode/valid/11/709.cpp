 class Solution {
public:
    int XXX(vector<int>& height) {
        if(height.empty())
           return 0;
        int size=height.size();
        int i=0;
        int j=size-1;
        int max=0;
        while(j>=i)
        {
            if(height[i]>=height[j])
            {
                max= ((j-i)*height[j])>max ?  ((j-i)*height[j]) : max;
                j--;
            }
            else
            {
                max= ((j-i)*height[i])>max ?  ((j-i)*height[i]) : max;
                i++;
            }
        }
        return max;
    }
};

