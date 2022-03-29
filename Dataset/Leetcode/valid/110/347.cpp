class Solution {
public:
    bool XXX(TreeNode* root) {
        if (!root)  return true;
        return traverse(root).first;        
    }
    pair<bool, int> traverse(TreeNode* root) {
        if (!root)  return {true, 0};
        auto [left, left_height] = traverse(root->left);
        auto [right, right_height] = traverse(root->right);
        bool is_bst = left && right && abs(left_height - right_height) <= 1;
        int height = max(left_height, right_height) + 1;
        return {is_bst, height};
        
    }
};

