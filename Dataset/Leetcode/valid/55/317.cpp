class Solution {
public:
    bool XXX(vector<int>& nums) {
        int start = 0;//当前访问的位置
        int end = 0;//表示目前能访问的位置
        while(start<=end){//保证当前访问位置不超过能访问到的位置
            //如果当前位置加上自身最大访问范围超过数组大小，返回1
            if(start+nums[start]>=nums.size()-1)
                return true;
            //更新end
            end = max(end,start+nums[start]);
            //更新start
            start++;
        }
        return false;
    }
};

