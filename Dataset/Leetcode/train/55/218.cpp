class Solution {
public:
    bool XXX(vector<int>& nums) {
        int can_reach=0;
        for(int i=0;i<nums.size();i++)
        {
            //如果目前循环到的坐标比你能到达的坐标大，说明这个坐标永远也到达不了，返回false
            if(i>can_reach)
                return false;
            //只要能到第i个坐标，那前i-1个坐标都能到达,只需要已知能到达的最大坐标和前i-1个坐标为起点能到达的位置哪个更大，就可以不断更新最大坐标
            can_reach=max(can_reach,nums[i]+i);
        }
        //如果能把所有坐标都走一遍，说明能到最后一个下标
        return true;
    }
};

