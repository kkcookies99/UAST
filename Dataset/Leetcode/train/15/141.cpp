 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int len = nums.size();
        vector<vector<int>> ans = {};
        for(int i = 0;i < len;++i){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int j = (i+1 < len) ? i+1 : len-1;
            int k = len-1;
            while(j < k){
                if(nums[j] + nums[k] == -(nums[i])){
                    vector<int> tmp = {nums[i],nums[j],nums[k]};
                    ans.push_back(tmp);
                    j++;
                    while(j < len-1 && nums[j] == nums[j-1]) j++;
                }
                else if(nums[j] + nums[k] < -(nums[i])){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
};

