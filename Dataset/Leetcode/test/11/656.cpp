 class Solution {
public:
    int XXX(vector<int>& height) {
        int res = 0;
        int height_min;
        int i = 0;
        int j = height.size() - 1;
        
        while(i < j){
            height_min = min(height[i], height[j]);
            res = max(res, height_min * (j - i));

            //我的错误写法，错误在于两端柱子会同时往中间变化。应该一次循环，只变化其中一个柱子
            /* if(height[i + 1] > height[i]){
                i++;
            } 
            if(height[j - 1] > height[j]) {
                j--;
            } */

            //只有从矮柱子往更高的柱子变化的时候，盛水的容积才有可能增大，因为柱子一旦变化，水平方向上的距离必然减小
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }

        return res;
    }
};

