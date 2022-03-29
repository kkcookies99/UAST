class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxStep = 1;//初始步数为1
        for (int i = 0; i < nums.size() && maxStep>0; ++i) {//如果还有步数,并且还没到末尾，那就继续走
            maxStep =  max(maxStep-1,nums[i]);//消耗一个步数，再看看这个格子给的步数多还是以前的格子给的步数多
            if(maxStep+i>=nums.size()-1) return true;//如果步数加上位置可以到达末尾，就返回true
        }
        return false;
    }
};

