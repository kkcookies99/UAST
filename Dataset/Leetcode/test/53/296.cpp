class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum=nums[0],max = nums[0];
        for(int i=1; i<nums.size(); i++)
        {
            if(sum<0)
                sum = nums[i];
            else
                sum += nums[i];
            max = fmax(max, sum);
        }
        return max;
    }
};

