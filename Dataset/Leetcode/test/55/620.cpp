 class Solution {
public:
    bool XXX(vector<int>& nums) {
        auto size=nums.size();
        auto maxi=0;
        for(auto i=0;i<size;++i){      
            if (i <= maxi) {
                maxi = max(maxi, i + nums[i]);
                if (maxi >= size - 1) {
                    return true;
                }
            }
        }
        return false;
    }
};

