class Solution {
public:
    int XXX(vector<int>& height) {
    int length=height.size();
    int max_water=0;
    for(int i=0;i<length;i++)
    {
        for(int j=length-1;j>i;j--)
        {
            int temp_height=height[j]-height[i]>0?height[i]:height[j];
            int temp_max=temp_height*(j-i);
            if(temp_max>max_water)
                max_water=temp_max;
        }
    }
    return max_water;
    }
};

