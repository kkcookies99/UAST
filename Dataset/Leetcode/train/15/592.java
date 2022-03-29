 class Solution {
private:
    vector<vector<int>> result;
    vector<int> path;       //path保留当前结果
    int sum=0;
    void backtracking(vector<int>& nums,int startIndex,vector<bool>& used)
    {   //回溯法
        if(sum==0&&path.size()==3)      //收集结果
        {
            result.emplace_back(path);
            return;
        }
        for(int i=startIndex;i<nums.size();i++)
        {   
            if(path.size()>=2&&sum+nums[i]!=0)continue;     //剪枝
            if(i>0&&nums[i]==nums[i-1]&&used[i-1]==false)continue;  //去重    
            sum+=nums[i];
            path.emplace_back(nums[i]);
            used[i]=true;
            backtracking(nums,i+1,used);
            used[i]=false;          //回溯部分
            sum-=nums[i];
            path.pop_back();
        }
    }
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size()<3)  return result;
        vector<bool> used(nums.size(), false);
        sort(nums.begin(),nums.end());      //排序方便去重
        backtracking(nums,0,used);
        return result;
    }
};

