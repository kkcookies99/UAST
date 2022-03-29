class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int> > res;
        if(nums.empty()) return res;
        vector<int> tmp;
        helper(nums,0,tmp,res);
        return res;
    }
    void helper(vector<int>& nums,int begin,vector<int> tmp,vector<vector<int> >& res){
        if(tmp.size()<=nums.size()) {
            res.push_back(tmp);
        }
        for(int i=begin;i<nums.size();i++){
            tmp.push_back(nums[i]);
            helper(nums,i+1,tmp,res);
            tmp.pop_back();
        }
    }
};

