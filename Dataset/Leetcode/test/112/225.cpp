 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root==nullptr)
            return false;

        if(root->left==nullptr&&root->right==nullptr&&targetSum-root->val==0)
            return true;

        return XXX(root->left,targetSum-root->val) || XXX(root->right,targetSum-root->val);
    }
};

