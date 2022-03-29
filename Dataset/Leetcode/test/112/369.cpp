 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if (root == nullptr) return false;
        queue<TreeNode *> que;
        que.push(root);
        while (!que.empty()) {
            int size = que.size();
            for (int i = 0; i < size; ++i) {
                TreeNode *cur = que.front();
                que.pop();
                if (cur->left == nullptr && cur->right == nullptr) {
                    if (cur->val == targetSum) return true;
                    continue;
                }
                if (cur->left) {
                    cur->left->val += cur->val;
                    que.push(cur->left);
                }
                if (cur->right) {
                    cur->right->val += cur->val;
                    que.push(cur->right);
                }
            }
        }
        return false;
    }
};

