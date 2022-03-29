class Solution {
public:
    void XXX(vector<int>& nums) {
        int n = nums.size();
        int i = 0;
        int left = 0, right = n - 1;
        while(i < n)
        {
            if(nums[i] == 0 && i > left)
            {
                swap(nums[i], nums[left]);
                left++;
            }
            else if(nums[i] == 2 && i < right)
            {
                swap(nums[i], nums[right]);
                right--;
            }
            else
            {
                i++;
            }
        }
//        return nums;
    }
};

