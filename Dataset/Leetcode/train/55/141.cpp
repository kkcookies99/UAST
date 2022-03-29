class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxPos = 0;//初始的最大位置是下标为0的位置
        for (int i = 0; i < nums.size() && i<=maxPos; ++i) {//一直走到最大位置处，并更新最大位置
            maxPos = max(maxPos,i+nums[i]);//最大位置由当前位置+步数得出
        }
        return maxPos>=nums.size()-1;//最后结束时，看看有没有走到数组末尾
    }
};

