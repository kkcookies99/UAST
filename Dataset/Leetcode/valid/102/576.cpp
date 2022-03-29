class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        dfs(root,0,ans);
        return ans;
    }

    void dfs(TreeNode* root,int deep,vector<vector<int>> &ans){
        if (root==NULL) return;
        int val=root->val;
        if (ans.size()>deep){
            ans[deep].push_back(val);
        }else{
            ans.push_back({val});
        }
        dfs(root->left,deep+1,ans);
        dfs(root->right,deep+1,ans);
    }
};

