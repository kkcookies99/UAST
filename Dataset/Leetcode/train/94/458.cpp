 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        if (root == NULL) return res;
        stack<TreeNode*> s;
        TreeNode* node = root;
        while (node || !s.empty()) {
            if (node) {
                s.push(node);
                node = node->left;
            } else {
                node = s.top();
                res.push_back(node->val);
                s.pop();
                node = node->right;
            }
        }
        return res;
    }
};

