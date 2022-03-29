class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)return 0;
        return check(root);
    }
    int check(TreeNode* root){
        if(!root)return INT_MAX;
        int left = check(root -> left);
        int right = check(root -> right);
        if(!root -> left && !root -> right)return 1;
        return min(left , right) + 1;
    }
};


