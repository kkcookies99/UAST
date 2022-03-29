 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ret;
        if (root == nullptr) {
            return ret;
        }
        TreeNode* p = root;
        stack<TreeNode*> s;
        while (p || !s.empty()) {
            if (p) {
                s.push(p);
                p = p->left;
            } else {
                TreeNode* cur = s.top();
                s.pop();
                ret.emplace_back(cur->val);
                p = cur->right;
            }
        }
        return ret;
    }
};

