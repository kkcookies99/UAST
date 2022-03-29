 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL) return false;
        sum-=root->val;
        if(root->left==NULL&&root->right==NULL) return sum==0;
        return XXX(root->left,sum)||XXX(root->right,sum);
    }
};

