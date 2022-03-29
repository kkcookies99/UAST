 class Solution {
public:
    int XXX(vector<int>& height) {
        int max_res = 0;
        int length = height.size();

        for(int i = length -1; i > 0; --i)
        {
            for(int j = 0; j + i < length; ++j)
            {
                int square = i * min(height[j], height[j+i]);
                max_res = max_res > square? max_res: square;
            }
        }

        return max_res;
    }
};

