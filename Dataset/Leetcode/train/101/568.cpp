 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        stack<TreeNode*> left, right;
        left.push(root->left);
        right.push(root->right);
        while(!left.empty() && !right.empty()) {
            TreeNode* l = left.top(), * r = right.top();
            left.pop(); right.pop();
            if(!l && !r) continue;
            if(!l || !r || l->val != r->val) return false; 
            left.push(l->left); left.push(l->right);
            right.push(r->right); right.push(r->left);
        }
        return true;
    }
};

