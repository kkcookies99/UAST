class Solution {
public:
    vector<vector<int>>res;
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int>vec;
        BackTrack(0,nums,vec);
        return res;
    }
    void BackTrack(int start,vector<int>&nums,vector<int>vec) {
        
        res.push_back(vec);
        if(vec.size()==nums.size()) {
            return;
        } 
        for(int i=start;i<nums.size();i++) {
            vec.push_back(nums[i]);
            BackTrack(i+1,nums,vec);
            vec.pop_back();
        }
    }
};

