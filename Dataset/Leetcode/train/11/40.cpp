class Solution {
public:
    int XXX(vector<int>& height) {//动态规划，以i，j从两边计算容积
        int i = 0, j = height.size() - 1;
        int volumn = 0;
        while(i <= j){
            volumn = min(height[i], height[j]) * (j-i) > volumn ? min(height[i], height[j]) * (j-i) : volumn;//计算容积，短板乘以j-i（即宽度）
            height[i] > height[j] ? j-- : i++;//较短一端移动
        }
        return volumn;
    }
};

