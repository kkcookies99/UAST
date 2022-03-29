class Solution {
public:
    void XXX(vector<int>& nums) 
    {
        int n = nums.size(); 
        if (n <= 1) return; 
        int left = -1, right = n; 
        while (left < n - 1 && nums[left + 1] == 0) ++left; 
        if (left == n - 1) return; 
        while (right > 0 && nums[right - 1] == 2) --right; 
        if (left == right - 1) return; 
        for (int i = left + 1; i < right; )
        {
            switch (nums[i])
            {
            case 0: 
                ++left; 
                nums[i] = nums[left]; 
                nums[left] = 0; 
                ++i; 
                break; 
            case 2: 
                --right; 
                nums[i] = nums[right]; 
                nums[right] = 2; 
                break; 
            default: ++i; 
            }
        }
    }
};

