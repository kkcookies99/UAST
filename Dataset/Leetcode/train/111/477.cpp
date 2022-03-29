class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == nullptr) return 0;
        
        int l = XXX(root->left);
        int r = XXX(root->right);

        if(l == 0) return r + 1;
        if(r == 0) return l + 1;
        return min(l, r) + 1;
    }
};

