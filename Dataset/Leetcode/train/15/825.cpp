 class Solution {
public:
    vector<vector<int> > XXX(vector<int>& nums) {
        vector<vector<int> > outSum;
        if (nums.size() < 3) return outSum;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < nums.size() - 2; i ++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -1 * nums[i];
            int p = i + 1, q = nums.size() - 1;
            while (p < q) {
                if (p > i + 1 && nums[p] == nums[p - 1]) {
                    p ++;
                    continue;
                }
                if (nums[p] + nums[q] == target) {
                    vector<int> curNum = {nums[i], nums[p], nums[q]};
                    outSum.push_back(curNum);
                    p ++; q --;
                }
                else if (nums[p] + nums[q] > target) q --;
                else p ++;
            }
        }
        return outSum;
    }
};

