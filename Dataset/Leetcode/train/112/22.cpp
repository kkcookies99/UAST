class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if (!root)  return false;
        queue<TreeNode*> q;
        q.push(root);

        while (!q.empty()) {
            auto t = q.front(); q.pop();
            // 当前节点是叶节点且路径和等于目标，满足条件返回true
            if (!t->left && !t->right && t->val == targetSum)    return true;
            // 将到当前节点的路径和传递给左右儿子
            if (t->left)    t->left->val += t->val, q.push(t->left);
            if (t->right)   t->right->val += t->val, q.push(t->right);
        }

        return false;
    }
};

