 class Solution {
public:
    bool flag;
    void dfs(vector<int>& nums,int x,vector<int>& visited){
        int len=nums.size();
        if(x>=len-1){
            flag=true;
            return;
        }
        if(visited[x]){
            return;
        }
        if(nums[x]==0){
            return;
        }
        visited[x]=1;
        for(int i=nums[x];i>0;i--){
            dfs(nums,i+x,visited);
        }
    }
    bool XXX(vector<int>& nums) {
        int len=nums.size();
        vector<int> visited(len);
        flag=false;
        dfs(nums,0,visited);
        return flag;
    }
};

