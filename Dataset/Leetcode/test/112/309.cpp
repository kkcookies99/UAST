 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return false;
//        if(targetSum<0) return false;
        if(root->left==nullptr && root->right==nullptr)
        {
            return (targetSum-root->val)==0?true:false;
        }
        return XXX(root->left,targetSum-root->val)||XXX(root->right,targetSum-root->val);
    }
};

