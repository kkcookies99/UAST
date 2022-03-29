 class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size() < 2){
            return 1;
        }
        if(nums[0] == 0){
            return 0;
        }
        int pos = 0, ans = 0;  //pos当前位置
        while(pos + nums[pos] < nums.size() - 1){  //当本次跳跃无法跳到终点时，需要进行下次跳跃
            int index = pos + 1, temp = nums[pos + 1];  
            for(int i = pos + 1; i < pos + 1 + nums[pos]; i++){
                if(nums[i]+i-index >= nums[index]){  //这里贪心选择本次跳跃和下次跳跃加起来最远的位置
                    index = i;
                    temp = nums[i];
                }
            }
            pos = index;
            if(nums[pos] == 0){
                return 0;
            }
        } //退出循环时，本次跳跃能到终点
        return 1;
    }
};

