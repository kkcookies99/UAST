 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int len = nums.size();
        int j=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
};

