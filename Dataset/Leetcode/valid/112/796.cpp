 class Solution {
public:
    bool ans = false;
    bool XXX(TreeNode* root, int sum) {
        if(root == nullptr) return false;
        dfs(root,sum);
        return ans;
    }
    void dfs(TreeNode* root,int sum){
        if(root == nullptr) return;
        if(!root->left && !root->right)
            if(sum == root->val)
                ans = true;
        dfs(root->left,sum - root->val);
        dfs(root->right,sum - root->val);
    }
};

