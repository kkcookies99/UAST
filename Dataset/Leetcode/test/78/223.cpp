class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        int n = nums.size();
        for (int i = 0; i < 1 << n; i++) {
            vector<int> path;
            for (int j = 0; j < n; j++) {
                if (i >> j & 1) {
                    path.push_back(nums[j]);
                }
            }
            res.push_back(path);
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


