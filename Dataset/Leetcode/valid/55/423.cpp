 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int reach = 0;
        int len = nums.size();
        for(int i=0; i<len; i++){
            reach = max(reach, i+nums[i]);
            if(reach>=len-1)
                return true;
            if(reach<=i)
                return false;
        }
        return false;
    }
};

