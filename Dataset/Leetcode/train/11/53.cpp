class Solution {
public:
    int XXX(vector<int>& height) {
        int ret = 0;
        for(int i = 0;i < height.size();i++)
        {
            for(int j = i+1;j < height.size();j++)
            {
                ret = max(ret, min(height[i], height[j]) * (j-i));
            }
        }
        return ret;
    }
};

