class Solution {
public:
    int check(TreeNode* rt){
        if(rt == nullptr) return 0;
        int left = check(rt->left);
        int right = check(rt->right);
        return max(left, right) + 1;
    }
    bool XXX(TreeNode* root) {
        if(root ==nullptr) return true;
        int left = check(root->left), right = check(root->right);
        return abs(left - right) <= 1 && XXX(root->left) && XXX(root->right);
    }
};

