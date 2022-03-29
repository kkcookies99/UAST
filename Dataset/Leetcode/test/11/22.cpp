class Solution {
public:
    int XXX(vector<int>& height) {
        int i=0,j=height.size()-1;
    int max=(j-i)*min(height[i],height[j]);
        while(i<j)
        {
            if(height[i]>height[j])
            j--;
            else
            i++;
            if((j-i)*min(height[i],height[j])>max)
            max=(j-i)*min(height[i],height[j]);
        }
        return max;
    }
};

