class Solution {
public:
    int XXX(vector<int>& nums) {
        if (nums.size() == 1) return nums[0];
        int sum=nums[0],cur=0;int i=0,j=0;
        while ( i < nums.size() && nums[i] < 0)
        {   sum = sum > nums[i] ? sum : nums[i];
            ++i;
        }
        for (j=i;j<nums.size();j++)
        {
            cur+=nums[j];
            if (cur <= 0) cur = 0;
            sum = cur > sum ? cur : sum;
        }
        return sum;
    }
};
code block

