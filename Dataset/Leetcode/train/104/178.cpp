class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == NULL)
            return 0;
        int result = 0;
        queue<TreeNode*> que;
        que.push(root);
        while (!que.empty()) {
            int size = que.size();
            for (int i = 0; i < size; ++i) {
                TreeNode* node = que.front();
                que.pop();
                if (node->left) que.push(node->left);
                if (node->right) que.push(node->right);
            }
            ++result;
        }
        return result;
    }
};

