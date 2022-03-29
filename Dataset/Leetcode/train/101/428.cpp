 class Solution {
public:
    bool ans;
    void traversalTree(TreeNode* t1, TreeNode* t2) {
        if (t1 && t2) {
            if (t1->val == t2->val) {
                traversalTree(t1->left, t2->right);
                traversalTree(t1->right, t2->left);
            } else {
                ans = false;
            }
        } else if ((!t1 && t2) || (t1 && !t2)) {
            ans = false;
        }
    }
    bool XXX(TreeNode* root) {
        if (!root) return true;
        ans = true;
        traversalTree(root->left, root->right);
        return ans;
    }
};

