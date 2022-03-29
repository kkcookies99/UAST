class Solution {
public:
    int XXX(vector<int>& nums) {
        //dp
        //1.状态定义 F(i)表示下标为i时连续数组的最大和
        //2.状态转移方程 F(i) = max(F(i-1)+nums[i],nums[i]);
        //3.初始状态 F(0) = nums[0];
        //4.返回值 F(nums.size()-1)
        
        //code
        if(nums.empty()) return 0;
        
        vector<int> v(nums);
        int maxNum = nums[0];
        for(int i = 1;i < nums.size();++i){
            v[i] = max(v[i-1]+nums[i],nums[i]);
            
            if(maxNum < v[i])
                maxNum = v[i];
        }
        
        return maxNum;
    }
};

