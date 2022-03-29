 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        dfs(res,root);
        return res;
    }

    void dfs(vector <int> res,TreeNode *root){
        if(root==NULL) return;
        dfs(res,root->left);
        res.push_back(root->val);
        dfs(res,root->right);
    }
};