 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>ans;
        if(nums.size() < 3)
        {
            return ans;
        }
        sort(nums.begin(),nums.end());
        for(int i = 0;i<nums.size()-2;i++)
        {
            if(nums[i] == nums [i+1]) continue;
            int target = -nums[i];
            int l = i+1;
            int r = nums.size()-1;
            while(l < r)
            {
                int sum = nums[l] + nums[r];
                if(sum > target) r--;
                else if(sum < target) l++;
                else 
                {
                    vector<int>tripset = {nums[i],nums[l],nums[r]};
                    ans.push_back(tripset);
                    while(nums[l+1] == nums[l]) l++;
                    while(nums[r-1] == nums[r]) r--;
                }
            }
            
        }
        return ans;
    }
};
