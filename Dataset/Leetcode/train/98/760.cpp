 class Solution {
public:
    bool XXX(TreeNode* root) {
        return dfs(root);
    }

    bool dfs(TreeNode* node, pair<optional<int>, optional<int>> range = {}) {
        if (node == nullptr) return true;
        auto [from, to] = range;
        if (node->val <= from || (to.has_value() && node->val >= to))
            return false;

        return dfs(node->left, std::make_pair(from, to ? min(to.value(), node->val) : node->val)) &&
            dfs(node->right, std::make_pair(from ? max(from.value(), node->val) : node->val, to));
    }
};

