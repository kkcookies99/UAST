 class Solution {
public:
    bool XXX(TreeNode* root) {
        return __height(root) >= 0;
    }

    int __height(TreeNode* cur){
        if(!cur) return 0;
        int L = __height(cur->left);
        if(L==-1) return -1;
        int R = __height(cur->right);
        if(R == -1) return -1;
        if(std::abs(L-R) < 2) return std::max(L, R) + 1;
        return -1;
    }
};

