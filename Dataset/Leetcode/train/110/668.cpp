 class Solution {
public:
    using PIB = pair<bool, int>;
    PIB solve(TreeNode *rt) {
        if (!rt) return {true, 0};
        PIB a = solve(rt->left);
        PIB b = solve(rt->right);
        return {a.first && b.first && abs(a.second - b.second) <= 1, max(a.second, b.second) + 1};
    }
    bool XXX(TreeNode* root) {
        return solve(root).first;
    }
};

