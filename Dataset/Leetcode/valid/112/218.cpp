 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root == nullptr) return false;
        else if(root->left == nullptr && root->right == nullptr) return targetSum - root->val == 0;
        else
        {
            int buf = targetSum - root->val;
            return XXX(root->left, buf) || XXX(root->right, buf);
        }
    }
};

