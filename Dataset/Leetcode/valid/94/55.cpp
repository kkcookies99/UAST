 class Solution {
public:
    vector<int>temp;
    void dfs(TreeNode* root){
         if(!root)return;
        dfs(root->left);
        temp.push_back(root->val);
        dfs(root->right);
    }
    vector<int> XXX(TreeNode* root) {
        dfs(root);
        return temp;
    }
};

