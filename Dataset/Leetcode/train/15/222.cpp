 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size() <= 2) return vector<vector<int>>();
        sort(nums.begin(),nums.end());
        vector<vector<int>> res;
        for(int i = 0; i < nums.size() - 2; ++i){
            int j = i + 1;
            int k = nums.size() - 1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while(j < k){
                if(j >= i + 2 && nums[j] == nums[j-1]) {
                    j++;
                    continue;
                }
                if((nums[i] + nums[j] + nums[k]) > 0) k--;
                else if((nums[i] + nums[j] + nums[k]) < 0) j++;
                else {
                    res.emplace_back(vector<int>{nums[i],nums[j],nums[k]});
                    j++;
                    k--;
                }
            }
        }
        return res;
    }
};

