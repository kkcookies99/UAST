class Solution {
public:
    int getHeight(TreeNode* root) {
        if (!root) return 0;
        else {
            int leftHeight = getHeight(root->left);
            int rightHeight = getHeight(root->right);
            return max(leftHeight, rightHeight) + 1;
        }
    }
    int getFactor(TreeNode* root) {
        return getHeight(root->left) - getHeight(root->right);
    }

    bool XXX(TreeNode* root) {
        if (!root) return true; 
        queue<TreeNode*> q; 
        q.push(root);
        while (!q.empty()) {
            TreeNode *t = q.front(); q.pop();
            if (abs(getFactor(t)) >= 2) return false; 
            if (t->left)  q.push(t->left);
            if (t->right) q.push(t->right);
        } 
        return true; 
    }
};

