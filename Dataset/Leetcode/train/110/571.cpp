class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == NULL)
            return true;
        int l = countheight(root -> left);
        int r = countheight(root -> right);
        return abs(l -r) <= 1 && XXX(root -> left) && XXX(root -> right);
    }
    int countheight(TreeNode* root){
        if(root == NULL)
            return 0;
        return max(countheight(root -> left), countheight(root -> right)) + 1;
    }
};

