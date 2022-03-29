 class Solution {
public:
    vector<int> nums;
    void PrintList(int m, int n) {
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i == 1 || j == 1)
                    nums[j] = 1;
                else
                    nums[j] = nums[j] + nums[j - 1];
            }
        }
    }
    int XXX(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        if (m < n - 1)
            return XXX(n, m);
        nums.resize(n + 1);
        PrintList(m, n);
        return nums[n];
    }
};

