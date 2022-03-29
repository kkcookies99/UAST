 class Solution {
public:
    void XXX(vector<int>& nums) {
        for(int i = 0, n = 0; n < nums.size(); n++, i++)
        {
            if(nums[i] == 0)
            {
                nums.insert(nums.begin(), nums[i]);
                nums.erase(nums.begin() + i + 1);
            }
            if(nums[i] == 2)
            {
                nums.insert(nums.end(), nums[i]);
                nums.erase(nums.begin() + i);
                i = i - 1;
            }
        }
        return ;
    }
};

