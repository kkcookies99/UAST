 class Solution {
public:

    bool dfs(TreeNode* root, int target ,int sum){
        if(root == NULL)
            return false; 
        sum += root->val;
        if(root->left == NULL && root->right==NULL && sum == target)
            return true;
        if(dfs(root->left, target,sum))
            return true;
        if(dfs(root->right, target, sum))
            return true;
        return false;
    }

    bool XXX(TreeNode* root, int sum) {
        return dfs(root, sum, 0);
    }
};

