 class Solution {
public:
    int XXX(vector<int>& nums) {
        if (nums.size() <= 1) return nums.size();

        for (int i = 0; i < nums.size()-1; i++)
            if (nums[i] == nums[i+1])  
                nums.erase(nums.begin()+i--);
        
        return nums.size();
    }
};

