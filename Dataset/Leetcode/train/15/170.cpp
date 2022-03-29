 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
    vector<vector<int>> ans;
    DFS(nums,0,0);
    for(set<vector<int>>::iterator it=myset.begin();it!=myset.end();++it)
    {
        ans.push_back(*it);
    }
    return ans;
    }
    void DFS(vector<int>& nums,int add,int start)
    {
        if(add==0&&ret.size()==3)
        {
            sort(ret.begin(),ret.end());
            myset.insert(ret);
            return;
        }
        if(ret.size()>=3)
            return;
        for(int i=start;i<nums.size();++i)
        {
            ret.push_back(nums[i]);
            DFS(nums,add+nums[i],i+1);
            ret.pop_back();
        }
    }
vector<int> ret;
set<vector<int>> myset;
}; 

