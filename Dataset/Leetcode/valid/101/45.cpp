 class Solution {
public:
    bool XXX(TreeNode* root) {
        if (root->left == nullptr && root->right == nullptr) return true;
        queue<TreeNode*> que;
        que.push(root->left);
        que.push(root->right);
        while (!que.empty()) {
            TreeNode* temp1 = que.front();
            que.pop();
            TreeNode* temp2 = que.front();
            que.pop();
            if (temp1 == nullptr && temp2 == nullptr) continue;
            if (temp1 == nullptr || temp2 == nullptr || (temp2->val != temp1->val)) return false;
            que.push(temp1->left);
            que.push(temp2->right);
            que.push(temp1->right);
            que.push(temp2->left);
        }
        return true;
    }
};

