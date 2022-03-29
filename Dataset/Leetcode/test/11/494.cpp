 class Solution {
public:
    // 解法：贪心法
    // 头尾双指针, 计算面积； 谁矮，推进谁。
    //时间复杂度O（N）, 空间复杂度O（1）
    int XXX(vector<int>& height) {
        int ans = 0;
        int i = 0, j = height.size() - 1;
        while (i < j) {
            int area = min(height[i], height[j]) * (j - i);
            ans = max(ans, area);
            if (height[i] < height[j]) i++;
            else j--;
        }
        return ans;
    }
};

