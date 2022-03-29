 class Solution {
public:
    bool sol(TreeNode* root, int& depth) {
        if (!root) {
            depth = 0;
            return true;
        }
        int ld, rd;
        bool lf = sol(root->left, ld);
        bool ri = sol(root->right, rd);
        depth = max(ld, rd) + 1;
        return lf && ri && abs(ld - rd) <= 1;
    }
    
    bool XXX(TreeNode* root) {
        int depth;
        return sol(root, depth);
    }
};

