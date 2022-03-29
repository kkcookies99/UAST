 class Solution {
public:
    vector<vector<int>> XXX(vector<int> &nums) {
        vector<vector<int>> result;
        if (nums.size() < 3) return result;
        sort(nums.begin(), nums.end());
        int a = 0, b, c;
        while (a < nums.size() - 1) {
            b = a + 1;
            c = nums.size() - 1;
            while (b < c) {
                if (nums[a] + nums[b] + nums[c] == 0) {
                    int arr[] = {nums[a], nums[b], nums[c]};
                    vector<int> vec(arr, arr + 3);
                    result.push_back(vec);
                    while (nums[b + 1] == nums[b] && b < nums.size() - 2) b++;
                    b++;
                    while (nums[c - 1] == nums[c] && b < c - 1) c--;
                    c--;
                } else if (nums[a] + nums[b] + nums[c] < 0) {
                    while (nums[b + 1] == nums[b] && b < nums.size() - 2) b++;
                    b++;
                } else {
                    while (nums[c - 1] == nums[c] && b < c - 1) c--;
                    c--;
                }
            }

            while (nums[a] == nums[a + 1] && a < nums.size() - 2) a++;
            a++;
        }
        return result;
    }
};

