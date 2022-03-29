 class Solution {
public:
    int XXX(vector<int>& nums) {

        if(nums.size()<=1) return nums.size();

        int i=0,j=1;
        int ans = 1;
        while(j<nums.size())
        {
            if(nums[i]!=nums[j])
            {
                swap(nums[i+1],nums[j]);
                ans+=1;
                i = i+1;
                j = j+1;
            }
            else
            {
                j++;
            }
        }
        return ans;
    }
};

