 class Solution {
public:
    bool XXX(vector<int>& nums) {
        bool flag = false;
        vector<int> flags;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == 0) {
                flag = true;
                if (i-1 > 0 && nums[i-1] == 0){
                    flags.pop_back();
                }
                flags.push_back(i);
            }
        }
        if (!flag) {
            return true;
        }
        if (flag && nums.size() == 1) {
            return true;
        }

        // 其实就是找到0的位置，然后看看是不是可以跳过0，不能的话就悲惨了
        for(int i = 0; i < flags.size(); i++) {
            if(i > 0){
                if (flags[i] == flags[i-1]+1) {
                    continue;
                }
            }
            int start = 0;
            int flag = false;
            for (int k =start; k < flags[i]; k++) {
                if (nums[k] + k >= nums.size()-1) {
                    return true;
                }
               // int skip_len = flags[i] - k;
                if (flags[i] == nums.size()-1) {
                    if (nums[k] >= flags[i] - k) {
                        flag = true;
                    }
                } else {
                    if (nums[k] > flags[i] - k) {
                        flag = true;
                    }
                }

            }

            if (!flag){
                return false; 
            }
        }
        return true;
    }
};

