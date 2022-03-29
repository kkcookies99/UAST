class Solution {
public:
    bool XXX(vector<int>& nums) {
        int max = 0;
        for(int i=0; i<nums.size(); i++)
        {
            if(i <= max && i + nums[i] > max) max = i + nums[i];
            else if(i > max) return false;
        }
        return true;
    }
};

