 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int flag = 0;
        for(int i = 0; i < nums.size(); i++){
            if(flag < i) return false;
            int r = i + nums[i];
            flag = max(r, flag);
            if(flag >= nums.size() - 1) return true;
        }
        return false;
    }
};


