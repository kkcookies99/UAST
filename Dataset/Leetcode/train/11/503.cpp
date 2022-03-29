 class Solution {
public:
    int XXX(vector<int>& height) {
        if (height.size() <= 1) {
            return 0;
        }

        int minId = 0;
        int maxId = height.size() - 1;
        int mostWater = 0;

        while (minId < maxId) {
            int minHeight = min(height[minId], height[maxId]); // 拿到较小的height
            mostWater = max(mostWater, (maxId - minId) * minHeight); // 保存最大存水量
            height[minId] > height[maxId] ? --maxId:++minId; // y较小的那边移动
        }

        return mostWater;
    }
};

