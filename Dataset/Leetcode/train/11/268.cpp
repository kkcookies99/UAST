class Solution {
public:
    int XXX(vector<int>& height) {
        int len=height.size();
        int max_volume=0;
        for(int i=0;i<len-1;i++)
            for(int j=i+1;j<len;j++)
            {
                int temp=(j-i)*min(height[i],height[j]);
                if(temp>max_volume)
                    max_volume=temp;
            }
        return max_volume;
    }
};

