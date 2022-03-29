 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int loc = nums.size();
        for(int i = 0; i < nums.size(); i++)
        {
            if(target <= nums[i])
                loc = i;
        }
        return loc;  
    }
};

