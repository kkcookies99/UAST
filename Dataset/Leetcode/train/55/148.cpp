class Solution {
public:
    bool XXX(vector<int>& nums) {
        int lastPosition = nums.size()-1;   //最后一个可以到达终点的位置
        for(int i = nums.size()-2; i >= 0; i --){
            if(i+nums[i] >= lastPosition){//能到lastPosition就能够到达终点
                lastPosition = i;
            }
        }
        if(lastPosition != 0){
            return false;
        } else return true;
    }
};

