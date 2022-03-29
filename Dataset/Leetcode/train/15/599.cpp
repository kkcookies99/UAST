 class Solution {
public:
    
    vector<vector<int>> XXX(vector<int>& nums) {
        set<vector<int>> res;
        vector<vector<int>> res_v;
        if(nums.size() < 3) return res_v;
        sort(nums.begin(),nums.end());
        if(nums[0] > 0 || nums[nums.size()-1] < 0) return res_v;
        int i = 0,j = nums.size()-1;

        for(int i=0;i< nums.size();i++)
        {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1,k = nums.size() - 1;
            while(j < k)
            {
                if(nums[i] + nums[j] + nums[k] == 0){
                    res.insert({nums[i] ,nums[j] , nums[k]});
                    j++,k--;
                }
                else if(nums[i] + nums[j] + nums[k] > 0) k--;
                else j++;
            }
        }
        
        if(res.size() == 0) return res_v;
        copy(res.begin(),res.end(),back_inserter(res_v) );
        return res_v;
    }
};

