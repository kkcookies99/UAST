 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return 0;
        if(root->left==NULL&&root->right==NULL&&root->val==sum) return 1;
        return 
        (XXX(root->left,sum-root->val))||
        (XXX(root->right,sum-root->val));
    }
};

