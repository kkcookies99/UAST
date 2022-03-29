 class Solution {
public:
    vector<int>path;
    vector<vector<int>>res;
    void dfs(vector<int>&nums,int sum,int index,vector<bool>&used){
        if(sum==0&&path.size()==3){
            res.push_back(path);
            return ;
        }
        for(int i=index;i<nums.size();i++){
            if(used[i]) continue;
            if(nums.size()-i<int(3-path.size())) return ;
            if(i>0&&nums[i-1]==nums[i]&&used[i-1]==false) continue;
            if(i<nums.size()-1&&sum+nums[i]+(int)(2-path.size())*nums[i+1]>0) return ;
            if(i<nums.size()-1&&sum+nums[i]+(int)(2-path.size())*nums[nums.size()-1]<0) continue;
            sum+=nums[i];
            used[i]=true;
            path.push_back(nums[i]);
            dfs(nums,sum,i+1,used);
            path.pop_back();
            sum-=nums[i];
            used[i]=false;
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size()==0) return res;
        vector<bool>used(nums.size(),false);
        sort(nums.begin(),nums.end());
        dfs(nums,0,0,used);
        return res;

    }
};

