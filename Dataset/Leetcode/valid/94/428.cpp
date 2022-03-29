 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        if (root == nullptr) return res;
        stack<TreeNode*> s;
        while (!s.empty() || root) {
            while (root) {
                s.push(root);
                root = root -> left;
            }
            res.push_back(s.top() -> val);
            root = s.top() -> right;
            s.pop();
        }
        return res;
    }
};

