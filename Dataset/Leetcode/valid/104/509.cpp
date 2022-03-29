class Solution {
public:
    int XXX(TreeNode* root) {
        return _dfs(root, 0);
    }
    int _dfs(TreeNode* root, int level){
        if(nullptr == root) return level;
        int left = _dfs(root->left, level+1);
        int right = _dfs(root->right, level+1);
        return left > right ? left : right;
    }
};

