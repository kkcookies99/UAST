class Solution {
public:
    bool XXX(TreeNode* root) {
        return helper(root).second;
    }

    pair<int, bool> helper(TreeNode* root) {
        if(!root) return {0, true};
        auto p1 = helper(root->left);
        if (!p1.second) return  {0, false};
        auto p2 = helper(root->right);
        if (!p2.second) return {0, false};
        return {max(p1.first, p2.first) + 1, abs(p1.first - p2.first) < 2};
    }
};

