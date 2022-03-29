 class Solution {
public:
    bool ans = false;
    void dfs(TreeNode* root,int  target,int  sum ){
        if( root == nullptr ) return;
        sum += root->val;
        if( sum == target && !root->left && !root->right ) ans = true;
        dfs(root->left,target,sum);
        dfs(root->right,target,sum);
        sum -= root->val;
    }

    bool XXX(TreeNode* root, int targetSum) {
        dfs(root,targetSum,0);
        return ans;
    }
};

