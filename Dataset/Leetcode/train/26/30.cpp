 class Solution {
public:
    int XXX(vector<int>& nums) {
        int len = nums.size();
        // sort(nums.begin(), nums.end());

        for(int i = 0; i<len-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums.erase(nums.begin()+i);
                i--; len--;
            }
        }
        return nums.size();

    }
};

