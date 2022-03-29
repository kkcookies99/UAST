class Solution {
public:

    bool dfs(int val,vector<int>& nums,int index,vector<pair<int,bool>>& vis){
        if(index >= val) return true;

        int count = nums[index];
        
        if(vis[index].first == 1){
            return vis[index].second;
        }
        for(int i=0;i<count;++i){
            if(dfs(val,nums,index+i+1,vis)){
                vis[index+i+1].first = 1;
                vis[index+i+1].second = true;
                return true;
            }else{
                vis[index+i+1].first = 1;
                vis[index+i+1].second = false;
            }
        }


        return false;
    }
    bool XXX(vector<int>& nums) {
        int n = nums.size();
        if(n == 1) return true;
        vector<pair<int,bool>> vis(n);

        return dfs(n-1,nums,0,vis);
    }
};

