 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        queue<TreeNode *> q1, q2;
        q1.push(p); q2.push(q);
        while (!q1.empty()) {
            int size = q1.size();
            for (int i = 0; i < size; ++i) {
                TreeNode *cur1 = q1.front(), *cur2 = q2.front();
                q1.pop(); q2.pop();
                if (!cur1 && !cur2) continue;
                if (!cur1 || !cur2 || (cur1->val - cur2->val)) return false;
                q1.push(cur1->left); q1.push(cur1->right);
                q2.push(cur2->left); q2.push(cur2->right);
            }
        }
        return true;
    }
};

