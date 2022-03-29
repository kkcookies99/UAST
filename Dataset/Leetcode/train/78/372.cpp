class Solution {
    vector<vi> res;
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int len = nums.size()-1;
        short now = 0, tar = 0;
        ffr(i, 0, len)
            tar = tar | (1<<i);
        vi t;
        while (tar >= now) {
            t.clear();
            ffr(i, 0, len) {
                if (now >> i & 1)
                    t.push_back(nums[i]);
            }
            res.push_back(t);
            now++;
        }
        return res;
    }
};

