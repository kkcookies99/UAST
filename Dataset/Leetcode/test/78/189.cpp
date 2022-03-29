class Solution {
public:
    vector <bool> vis;
    vector <int> tmp;
    int count;
    void dfs(vector <int> &nums,vector <vector <int>> &array,int para,int curPos){
        if(para==count)
        return ;

        for(int i=curPos;i<count;++i){
            if(!vis[i]){
                vis[i]=true;
                for(int i=0;i<count;++i){
                    if(vis[i])
                    tmp.push_back(nums[i]);
                }
                array.push_back(tmp);
                tmp.clear();
                dfs(nums,array,para+1,i+1);
                vis[i]=false;
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector <vector <int>> res;

        count=nums.size();
        vis.resize(nums.size(),false);
        res.push_back(vector <int> (0));

        dfs(nums,res,0,0);

        return res;
    }
};

