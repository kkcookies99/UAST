class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums,0);
        return res;
    }
private:
    vector<vector<int>> res;
    void dfs(vector<int>& nums,int pos){
        if(pos==nums.size()){
            res.push_back(nums);
            return;
        }
        for(int i=pos;i<nums.size();i++){
            swap(nums[i],nums[pos]);
            dfs(nums,pos+1);
            swap(nums[i],nums[pos]);
        }
    }
};

