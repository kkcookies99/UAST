 class Solution {
public:
    bool XXX(vector<int>& nums) {
        // 记录当前位置和当前能到达的最远位置
        int cur_pos = 0, cur_max = nums[0]; 
       
        // just jump as you can still jump
        while(cur_pos != nums.size()-1 && cur_pos < cur_max) {
            // 往前跳一步，重新计算当前位置能跳到的最远位置
            // 这里没限制跳跃的次数，那么一次跳一步和一次跳多步最终效果都是一样的
            // 一次跳多步有可能略过了中间某些具有更优解的点，所以只跳一步即可
            cur_pos++;
            cur_max = max(cur_max, cur_pos+nums[cur_pos]);
        }
        // 返回是否跳到了终点
        return cur_pos == nums.size() - 1;
    }
};

