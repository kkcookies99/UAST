 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        if(!root ->left && !root ->right) return sum - root->val ==0;
        return XXX(root -> right,sum - root->val) || XXX(root -> left ,sum - root->val);
    }
};

