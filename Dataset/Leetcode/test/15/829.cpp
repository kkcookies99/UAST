 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int> > res;
        if(nums.size()<3)
            return res;
        sort(nums.begin(), nums.end());
        for(int i=0; i<nums.size()-2; ++i){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1, k=nums.size()-1;
            int target = -nums[i];
            while(j<k){
                if(nums[j]+nums[k]>target)
                    --k;
                else if(nums[j]+nums[k]<target)
                    ++j;
                else{
                    res.push_back({nums[i], nums[j], nums[k]});
                    ++j;
                    --k;
                    while(j<k && nums[j-1]==nums[j])
                        ++j;
                    while(k>j && nums[k+1]==nums[k])
                        --k;    
                }
            }
        }
        return res;
    }
};```

