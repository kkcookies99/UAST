 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> tmp;
        vector<vector<int>> res;
        if(nums.size() == 0) return res;
        sort(nums.begin(),nums.end());
        for(int i = 0; i < nums.size();i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1,k = nums.size() - 1;
            while(j < k){
                if(nums[j] + nums[k] == -nums[i]){
                    res.push_back({nums[i],nums[j],nums[k]});
                    j++,k--;
                    while(nums[j] == nums[j - 1] && j < k) j++;
                    while(nums[k] == nums[k + 1] && j < k) k--;
                }
                else if(nums[j] + nums[k] > -nums[i]) k--;
                else j++;
            }
        }
        return res;
    }
};


