class Solution {
public:
    int XXX(vector<int>& height) {
        int left = 0;
        int right = height.size()-1;
        int max = 0;
        while(left <= right)
        {
            int d = right - left;
            int h;
            if(height[left] < height[right])
            {
                h = height[left];
                ++left;
            }
            else
            {
                h = height[right];
                --right;
            }
            int s = d * h;
            if(s > max)
                max = s;
        }
        return max;
    }
};

