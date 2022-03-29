 class Solution {
public:
    bool XXX(TreeNode* node, int64_t min = INT64_MIN, int64_t max = INT64_MAX) {
        return (node == nullptr) || node->val < max && node->val > min && XXX(node->left, min, node->val) && XXX(node->right, node->val, max);
    }
};

