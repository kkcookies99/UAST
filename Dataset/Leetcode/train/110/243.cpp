class Solution {
public:
    bool flag = true;
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        int l = height(root->left);
        int r = height(root->right);
        return abs(l-r)<=1&&flag? true: false;
    }
    int height(TreeNode* root){
        if(!root)
            return 0;
        int l = height(root->left);
        int r = height(root->right);
        if(abs(l-r)>1)
            flag = false;
        return max(l, r)+1;
    }
};

