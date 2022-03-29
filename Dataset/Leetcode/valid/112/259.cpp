 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root==nullptr)
            return false;
        targetSum -= root->val;
        if(!root->left&&!root->right)
            return targetSum == 0;
        return XXX(root->left,targetSum) || XXX(root->right,targetSum);
    }
};

