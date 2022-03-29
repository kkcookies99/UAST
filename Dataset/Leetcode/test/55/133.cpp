class Solution {
public:
    bool XXX(vector<int>& nums) {
        int farest = 0;
        for (int  i = 0; i < nums.size(); i++) {
            if (i <= farest) {
                farest = max(farest, i + nums[i]);
            }
        }

        return farest >= nums.size() - 1;
    }
};

