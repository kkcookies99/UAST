 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root)return false;
        targetSum-=root->val;
        if(!root->left&&!root->right)return !targetSum;
        return root->left&&XXX(root->left,targetSum)||root->right&&XXX(root->right,targetSum);
    }
};

