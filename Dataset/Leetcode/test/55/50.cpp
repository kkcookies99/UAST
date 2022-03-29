class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n=nums.size();
        int max_distance=0;
        //从头开始，记录每一个下标能到达的最远位置，将该最大值记录下来，若下标值>目前所能到达的最远距离，则返回false，提前退出循环
        for(int i=0;i<n;i++)
        {
            if(max_distance<i)
            return false;
            if(max_distance<nums[i]+i)
                max_distance=nums[i]+i;
        }
        return true;
    }
};

