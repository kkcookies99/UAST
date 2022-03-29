 class Solution {
public:
    int XXX(vector<int>& height) {
        int res=0,i,j;
        for(i=0;i<height.size();i++)
        {
            if(res>=height[i]*(height.size()-1-i)){//限制条件
                continue;
            }
            for(j=i+1;j<height.size();j++)
            {
                int temp=min(height[i],height[j])*(j-i);
                res=temp>res?temp:res;
            }
        }
        return res;
    }
};

