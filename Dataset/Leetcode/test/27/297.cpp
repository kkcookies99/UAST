 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int j = nums.size() - 1;
        for (int i = nums.size() - 1; i >= 0; i--)
        {
            if (nums[i] == val)
               nums[i] = nums[j--];
        }
        
        return j + 1;
    }
};

