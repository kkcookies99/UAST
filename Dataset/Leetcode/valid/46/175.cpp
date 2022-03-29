class Solution {
public:
    vector<vector<int>> res;
    
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> flag(1000000,0);
        vector<int> temp;
        dfs(nums,temp,flag);
        return res;
    }
    void dfs(vector<int>& nums,vector<int>& temp,vector<int>& flag)
    {
        int n=nums.size();   
         //退出条件：达到n个数就退出
        if(temp.size()==n)
        {
            res.push_back(temp);
            return;
        }
        //列出从第一个数字到最后一个数字所有可能的情况        
        for(int i=0;i<n;i++)
        {
            //排除不合法的选择,有相同的数就删去
            if(flag[i]==1)
                continue;
            //进行选择
            //把当前的数字加入路径，找到当前数字可能的所有组合情况
            temp.push_back(nums[i]);
            flag[i]=1;
           
            dfs(nums,temp,flag);
            //撤回选择：加入的数字从路径种删除
            temp.pop_back();
           flag[i]=0;

        }
        
    }
};

