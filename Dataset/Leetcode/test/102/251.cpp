class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if (!root) return {};
        vector<vector<int>> ans;
        queue<TreeNode *> q;
        q.push(root);
        while (!q.empty()) {
            int size = q.size();
            vector<int> temp;
            for (int i = 0; i < size; i++) {
                auto front = q.front();
                q.pop();
                temp.push_back(front->val);
                if (front->left) q.push(front->left);
                if (front->right) q.push(front->right);
            }
            ans.emplace_back(move(temp));
        }
        return ans;
    }
};

