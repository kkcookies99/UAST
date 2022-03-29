 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root == nullptr) return false;
        sum = sum - root->val;
        if(root->left == nullptr && root->right == nullptr) return sum == 0;
        return XXX(root->right, sum) || XXX(root->left, sum);
    }
};

