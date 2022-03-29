 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        int size = nums.size();
        sort(nums.begin(), nums.end());
        for(int i = 0; i < size-2 && nums[i] <= 0; ++i) {
            int a = nums[i];
            if(i-1 >= 0 && a == nums[i-1])  continue;
            int target = -a, k = size-1;
            for(int j = i+1; j < size-1; ++j) {
                int b = nums[j];
                if(j-1 >= i+1 && b == nums[j-1])    continue;
                int c = target - b;
                while(j < k && nums[k] > c) --k;
                if(j == k)  break;
                if(nums[k] == c)    ans.push_back({a, b, c});
            }
        }
        return ans;
    }
};

