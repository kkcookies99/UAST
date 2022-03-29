class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int s = nums.size(); int n , b;
        vector<vector<int>> ans;
        vector<int> buf;
        for (n = 0; n < 1 << s; n++) {
            buf.clear();
            for (b = 0; b < s; b++) {
                if (1 << b & n) buf.push_back(nums[b]);
            }
            ans.push_back(buf);
        }
        return ans;
    }
};

