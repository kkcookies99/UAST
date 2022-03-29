 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int curDistance = 0;
        for(int i = 0;i<=curDistance;++i){
            curDistance = max(i + nums[i],curDistance);
            if(curDistance >= nums.size()-1)
                return true;
        }
        return false;
    }
};

