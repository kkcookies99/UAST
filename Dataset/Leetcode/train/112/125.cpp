class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        // bfs
        if (!root) return false;
        queue<TreeNode*> q_node;
        queue<int> q_val;
        q_node.push(root);
        q_val.push(root->val);
        while (!q_node.empty()) {
            TreeNode* top = q_node.front();
            q_node.pop();
            int sum = q_val.front();
            q_val.pop();
            if (!top->left && !top->right) {
                if (sum == targetSum) {
                    return true;
                }
            }
            if (top->left) {
                q_node.push(top->left);
                q_val.push(sum + top->left->val);
            }
            if (top->right) {
                q_node.push(top->right);
                q_val.push(sum + top->right->val);
            }
        }
        return false;
    }
};

