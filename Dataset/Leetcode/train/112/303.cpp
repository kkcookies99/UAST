 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root == nullptr) return false;
        else if(root->left == nullptr && root->right == nullptr) return targetSum == root->val? true : false;
        else return XXX(root->left, targetSum - root->val) || XXX(root->right, targetSum - root->val);
    }
};

