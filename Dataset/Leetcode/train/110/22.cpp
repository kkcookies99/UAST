class Solution {
public:
    bool XXX(TreeNode* root) {
        try {
            travel(root);
            return true;
        } catch (...) {
            return false;
        }
    }
    
    int travel(TreeNode* node) {
        if (!node) return 0;

        auto ld = travel(node->left);
        auto rd = travel(node->right);
    
        if (abs(ld - rd) > 1) throw 0;
        
        return std::max(ld, rd) + 1;
    }
};

