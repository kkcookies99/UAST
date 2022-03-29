 class Solution {
public:
    bool XXX(vector<int>& nums) {
        if (nums.empty()) return false;

        int n = nums.size();
        vector<int> f(n);
        f[0] = false;

        int last = 0;
        for (int i = 1; i < n; i ++)
        {
            while(last < i && last + nums[last] < i) last ++;

            if (last == i) return false;
        }
        return true;
    }
};

