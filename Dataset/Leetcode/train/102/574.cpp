class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode*> que;
        if (root != NULL) que.push(root);
        vector<vector<int>> result;
        while (!que.empty()) {
            int size = que.size();
            vector<int> vec;
            for (int i = 0; i < size; i++) {
                TreeNode* node = que.front();
                que.pop();
                if (node != NULL) {
                    vec.push_back(node->val);
                    if (node->left) que.push(node->left);
                    if (node->right) que.push(node->right);
                }
            }
            result.push_back(vec);
        }
        return result;
    }
};

