class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        return root==nullptr?false:root->left==nullptr&&root->right==nullptr&&targetSum==root->val?true:XXX(root->left,targetSum-root->val)||XXX(root->right,targetSum-root->val);
    }
}

