 class Solution {
public:
    vector<vector<int>> vv;
    vector<int> v;
    void _combine(int index,vector<int>& nums)
    {
        if(v.size() == nums.size()) {
            vv.push_back(v); 
            return;
        }
        
        vv.push_back(v);
        for(int i = index;i < nums.size();i++) {
            v.push_back(nums[i]);
            _combine(i+1,nums);
            v.pop_back();            
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        _combine(0,nums);
        return vv;
    }
};

