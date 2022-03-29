 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* d) {
        queue<TreeNode*> q;
        q.push(p), q.push(d);
        while (!q.empty()) {
            auto a = q.front();
            q.pop();
            auto b = q.front();
            q.pop();

            if (a == nullptr && b == nullptr) continue;
            if (a == nullptr || b == nullptr) return false;
            if (a->val != b->val) return false;
            
            q.push(a->left), q.push(b->left);
            q.push(a->right), q.push(b->right);
        }

        return true;
    }
};

