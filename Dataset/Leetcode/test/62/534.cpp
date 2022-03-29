class Solution {
public:
    int XXX(int m, int n) {
        int res = 0;
        vector<vector<int>>nums(m, vector<int>(n, 0));
        for(int i = 0; i< m; ++i)
            for(int j = 0; j< n; ++j)
                nums[i][j] = (i == 0 || j == 0) ? 1 : nums[i][j-1] + nums[i-1][j];
        return nums[m-1][n-1];
    }
};

