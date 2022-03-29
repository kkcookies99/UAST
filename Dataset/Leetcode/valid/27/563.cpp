 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        if(nums.empty())
            return 0;
        int count = 0;
        for(int i = 0;i<nums.size();i++){
            if(nums[i]==val)
                count++;
        }
        int j = 0;
        for(int i =0;i<nums.size();i++){
            if(nums[i]!=val)
                nums[j++]=nums[i];
        }
        return nums.size()-count;
    }
};

