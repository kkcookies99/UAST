class Solution {
public:
    int XXX(vector<int>& height) 
    {
        int ret = 0;
        for (int i = 0; i < height.size() - 1; ++i)
        {
            for (int j = i + 1; j < height.size(); ++j)
            {
                int area = (j - i) * std::min(height[i], height[j]);
                if (area > ret)
                {
                    ret = area;
                } 
            }
        }
        return ret;
    }
};

