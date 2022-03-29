 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        bool*put=new bool[nums.size()];
        for(int i=0;i<nums.size();i++)put[i]=false;
        vector<vector<int>>res;
        vector<int>cur={};
        dfs(nums,put,0,cur,res);
        return res;
    }
    void dfs(vector<int>&nums,bool*put,int pos,vector<int>cur,vector<vector<int>>&permutation_set){
        if(pos==nums.size()){
            permutation_set.push_back(cur);
            return;
        }
        else{
            for(int i=0;i<nums.size();i++){
                if(put[i])continue;
                else{
                    put[i]=true;
                    cur.push_back(nums[i]);
                    dfs(nums,put,pos+1,cur,permutation_set);
                    cur.pop_back();
                    put[i]=false;
                }
            }
        }
    }
};

