class Solution {
public:
    int dfs(TreeNode* node){
        if(node == NULL) return 0;
        int L = dfs(node->left);
        int R = dfs(node->right);
        int res = max(L,R) + 1;
        return res;
    }


    int XXX(TreeNode* root) {
        int ans = dfs(root);
        return ans;
    }
};

