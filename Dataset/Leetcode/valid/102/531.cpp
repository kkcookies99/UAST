class Solution {
public:
    vector<int> v[100005];
    vector<vector<int>> XXX(TreeNode* root) {
        int level = dfs(root,0);
        vector<vector<int>> ans;
        for(int i=0; i < level;i++){
            ans.push_back(vector<int>(v[i].begin(),v[i].end()));
        }
        return ans;
    }

   
    int dfs(TreeNode* rt,int dep){
        if(rt==NULL){
            return 0;
        }
        v[dep].push_back(rt->val);
        return 1 + max(dfs(rt->left,dep+1),dfs(rt->right,dep+1));
    }
};

