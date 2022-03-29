class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if (root == NULL)return 0;
        if (sum == root->val&&root->left==NULL&&root->right==NULL)return 1;
        return XXX(root->left, sum - root->val) || XXX(root->right, sum - root->val);
    }
};

