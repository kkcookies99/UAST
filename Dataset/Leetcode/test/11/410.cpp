 class Solution {
public:
    // 双指针算法思路的关键就是双指针的移动规则，
    // 不要以保证所维护的区间当前最大值为准，
    // 而要以区间两侧大小为准
    int XXX(vector<int>& height) {
        int i = 0, j = height.size() - 1;
        int res = min(height[i], height[j]) * (j - i);
        while(i < j) {
            if(height[i] > height[j]) --j;
            else ++i;
            res = max(res, min(height[i], height[j]) * (j - i));
        }
        return res;
    }
};

