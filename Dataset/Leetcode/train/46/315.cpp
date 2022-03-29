class Solution {
public:
    void getAns(vector<vector<int>>& res, vector<int>& nums, vector<int> path, vector<int> tag){
        
        if(path.size() == nums.size()){
            res.push_back(path);
            return;
        }
        
        for(int i = 0; i < nums.size(); i++){
            if(tag[i] == 1) continue;
            path.push_back(nums[i]);
            tag[i] = 1;
            getAns(res, nums, path, tag);
            path.pop_back();
            tag[i] = 0;
        }
        
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> path, tag;
        for(int i = 0; i < nums.size(); i++)
            tag.push_back(0);
        getAns(res, nums, path, tag);
        
        return res;
    }
};

