 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> res;
        int len = nums.size(), l, r, tmp;
        for (int i = 0; i < len - 2; i++)
        {
            if (nums[i] > 0) return res;
            while (i>0&&i<len-2&&nums[i] == nums[i - 1]) i++;
            l = i + 1, r = len - 1;
            while (l < r)
            {
                tmp = nums[l] + nums[r] + nums[i];

                if(tmp==0) {
                res.push_back({ nums[i],nums[l],nums[r] });
                while (l < r && nums[l] == nums[l + 1]) l++;
                while (l < r && nums[r] == nums[r - 1]) r--;
                l++,r--;}
                else if (tmp < 0)
                l++;
                else r--;
            }
        }
        return res;

    }
};

