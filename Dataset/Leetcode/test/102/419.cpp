class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode *> q;
        vector<vector<int>> res;
        q.push(root);
        while (!q.empty()) {
            vector<int> v;
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode *cur = q.front();
                q.pop();
                if (cur == nullptr) continue;
                v.push_back(cur->val);
                q.push(cur->left);
                q.push(cur->right);
            }
            if (v.size()) res.push_back(v);
        }
        return res;
    }
};

