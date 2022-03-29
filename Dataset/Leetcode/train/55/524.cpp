 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int len = nums.size()-1;

        int max = 0;
        for(int i = 0;i<len;i++)
        {
            for(int j = i;j<=(i+nums[i]);j++)
            {
                max = (j+nums[j])>=(max+nums[max]) ? j : max ;
                if(max!= len && nums[max]==0) return false;
                if(max+nums[max]>=len) return true;
            }
            i = max-1;
        }
        return max>=len;

    }
};

