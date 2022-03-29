 class Solution {
public:
    static constexpr int N = 1010;
    pair<TreeNode*,TreeNode*> q[N];
    int hh = 0, tt = -1;
    bool XXX(TreeNode* root) {
        if (!root) return true;

        q[++tt] = {root->left, root->right};
        for (; tt >= hh; ++hh) {
            TreeNode* node1 = q[hh].first;
            TreeNode* node2 = q[hh].second;
            if (!node1 && !node2) continue;
            if ((!node1 && node2) || (node1 && !node2)) return false;
            if (node1->val != node2->val) return false;
            q[++tt] = {node1->left, node2->right};
            q[++tt] = {node1->right, node2->left};
        }
        return true;
    }
};

