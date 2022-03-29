class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        int x = n, z = n;
        while(--z) x *= z;
        vector<vector<int> > res(x, vector<int>(n, 0));
        int i = 0;
        do {
            res[i] = nums;
            i++;
        } while(next_permutation(nums.begin(), nums.end()));
        return res;
    }
};

