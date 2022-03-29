 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        if(nums.size() <3)
            return ret;
        
        sort(nums.begin(),nums.end());
        if(nums[0] > 0)
            return ret;
        set<vector<int>> s;
        for(int i = 0;i<nums.size();i++)
        {
            if(i >= 1 && nums[i] == nums[i-1])
                continue;
            map<int,int> m;
            for(int j = i+1;j<nums.size();j++)
            {
                if(m[nums[j]] == 0)
                    m[-nums[j]-nums[i]] = 1;
                else
                    s.insert({nums[i],nums[j],-nums[i]-nums[j]});
            }
        }
        ret.assign(s.begin(), s.end());
        return ret;
    }   
};

