 class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> track;
        backtrack(nums,track);
        return res;
    }

    void backtrack(vector<int>& nums,vector<int> &track)
    {
        if(track.size() == nums.size())
        {
            res.push_back(track);
            return ;
        }      
        for(int idx = 0 ; idx < nums.size() ; idx++)
        {
            auto it = std::find(track.begin(),track.end(),nums[idx]);
            if(it != track.end())
                continue;
            track.push_back(nums[idx]);
            backtrack(nums,track);
            track.pop_back();
        }
    }
};

