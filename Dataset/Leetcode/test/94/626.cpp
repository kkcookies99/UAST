 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        dfs(root,ans);
        return ans;
    }

    void dfs(TreeNode* root,vector<int> &ans){
        if (root==NULL) return;
        dfs(root->left,ans);
        ans.push_back(root->val);
        dfs(root->right,ans);
    }
};

