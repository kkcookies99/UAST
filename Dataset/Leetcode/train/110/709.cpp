 class Solution {
public:
    bool XXX(TreeNode* root) {
        if (!root) return true;
        int diff = abs(maxDepth(root->left)-maxDepth(root->right));
        return (diff==0 || diff==1) && XXX(root->left) && XXX(root->right);
    }

    // 104. Maximum Depth of Binary Tree
    int maxDepth(TreeNode* node){
        return (!node) ? 0 : max(maxDepth(node->left), maxDepth(node->right)) + 1;
    }
};

