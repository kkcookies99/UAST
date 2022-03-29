 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        if (!root) return {};
        stack<pair<TreeNode *, bool>> s;
        s.push({root, false});
        vector<int> ans;
        while (!s.empty()) {
            auto &[p, k] = s.top();
            if (k) {
                s.pop();
                ans.emplace_back(p->val);
                if (p->right) s.push({p->right, false});
            } else {
                if (p->left) s.push({p->left, false});
                k = true;
            }
        }
        return ans;
    }
};

