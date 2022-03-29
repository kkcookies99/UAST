class Solution {
public:
    bool XXX(vector<int>& nums) {
        //记录下每个点能达到的最大下标就行……超过n-1就一定能到
        int temp=nums.front();
        for(int i=1;i<nums.size()-1;i++)
            temp = i<=temp ? max(nums[i]+i,temp):temp;
        if(temp>=nums.size()-1) return true;
        else return false;
    }
};

