class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> result;
        queue<TreeNode*> q;
        if (root) q.push(root);
        while (!q.empty()) {
            int size = q.size();
            vector<int> level;
            for (int i = 0; i < size; ++i) {
                TreeNode *cur = q.front();
                q.pop();
                level.push_back(cur->val);
                if(cur->left) q.push(cur->left);
                if(cur->right) q.push(cur->right);
            }
            result.emplace_back(std::move(level));
        }
        return result;
    }
};

