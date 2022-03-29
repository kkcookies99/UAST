 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        int n = nums.size();
        if(n < 3)
            return ret;
        sort(nums.begin(), nums.end());
        int tmp = nums[0];
        for(int i = 0; i < n - 1 && nums[i] <= 0; i++) {
            if(tmp == 0 - nums[i]) {
                i++;
                continue;
            }
            tmp = 0 - nums[i];
            int left = i + 1, right = n - 1;
            while(left < right) {
                int sum = nums[left] + nums[right];
                if(sum < tmp) {
                    left ++;
                }
                else if(sum > tmp) {
                    right --;
                }
                else {
                    ret.push_back({nums[i], nums[left], nums[right]});
                    if(nums[left] == nums[left + 1] && nums[right] == nums[right - 1]) {
                        left = left + 2;
                        right = right - 2;
                    }
                    else {
                        left++;
                        right--;
                    }
                }
            }
        }
        return ret;
    }
};

