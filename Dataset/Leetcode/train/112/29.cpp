class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
    if(root==nullptr) return false;
    if(root->left==nullptr && root->right==nullptr && root->val==targetSum) return true ;
    if(XXX(root->right,targetSum-root->val) || XXX(root->left,targetSum-root->val))
    return true;
    else return false;
    }
};

