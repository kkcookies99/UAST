class Solution {
public:
    void XXX(vector<int>& nums) {
        if(nums.empty() || nums.size() == 1)
            return;
        int left = 0, right = nums.size() - 1;
        while(left < right)
        {
            while(left < right && nums[left] == 0)
                left++;
            while(left < right && nums[right] != 0)
                right--;
            if(left < right)
            {
                swap(nums[left], nums[right]);
                left++;
                right--;
            }
        }
        left = 0, right = nums.size() - 1;
        while(left < right && nums[left] == 0)
            left++;
        while(left < right)
        {
            while(left < right && nums[left] == 1)
                left++;
            while(left < right && nums[right] != 1)
                right--;
            if(left < right)
            {
                swap(nums[left], nums[right]);
                left++;
                right--;
            }
        }
        
    }
};

