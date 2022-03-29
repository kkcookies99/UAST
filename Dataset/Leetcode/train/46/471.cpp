 class Solution {
public:
    vector<vector<int>> res;//全局变量用于存储所有结果
    void dfs(vector<int> &path,vector<int> nums,vector<bool> &used){
        if(path.size()==nums.size()){
            res.push_back(path);
            return;
        }
        else{
            for(int i=0;i<nums.size();i++){//分别用1，2，3.....做为全排列的第一个数字
                if(!used[i]){
                    path.push_back(nums[i]);
                    used[i]=true;
                    dfs(path,nums,used);//将所有以nums[i]为第一个数字的全排列遍历完成
                    used[i]=false;//恢复状态
                    path.pop_back();
                }
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int>path(0);
        vector<bool> used(nums.size(),false);
        dfs(path,nums,used);
        return res;
    }
};

