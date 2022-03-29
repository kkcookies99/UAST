class Solution {
private:
    vector<vector<int>> res;
    void dfs(vector<int>& nums,int index){
        if(index==nums.size()){
            res.push_back(nums);
        }
        bool isUsed[21]={false};
        for(int i=index;i<nums.size();++i){
            if(isUsed[nums[i]+10]) continue;
            isUsed[nums[i]+10]=true;
            swap(nums[i],nums[index]);
            dfs(nums,index+1);
            swap(nums[i],nums[index]);
        }
    }
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums,0);
        return res;
    }
};

