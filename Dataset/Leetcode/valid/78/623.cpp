 class Solution {
public:
    vector<vector<int>> res;
    void tra(vector<int>& nums,int n,int i,vector<int> &tmp){
        if(i==n){
            res.push_back(tmp);
            return;
        }
        tmp.push_back(nums[i]);
        tra(nums,n,i+1,tmp);
        tmp.pop_back();
        tra(nums,n,i+1,tmp);
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        res.clear();
        if(nums.size()==0) return res;
        vector<int> tmp;
        tra(nums,nums.size(),0,tmp); 
        return res;
    }
};

