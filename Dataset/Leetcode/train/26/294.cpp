 class Solution {
public:
    int XXX(vector<int>& nums) {
        int vlens = nums.size();
        if(vlens == 0) return 0;
        
        int i = 0, j = i + 1;
        while(j < vlens)
        {
            if(nums[i] == nums[j])
                j++;
            else
            {
                nums[i+1] = nums[j];
                i++;
                j++;
            }
        }
        
        return i+1;
    }
};

