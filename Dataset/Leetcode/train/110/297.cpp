class Solution {
public:
    int depth(TreeNode* root){
        if(!root)return 0;
        int l = depth(root->left);
        int r = depth(root->right);
        return max(l ,r) +1;
    }
    bool XXX(TreeNode* root) {
        if(!root)return true;
        int l = depth(root->left);
        int r = depth(root->right);
        if(abs(l - r)<=1)return XXX(root->left) && XXX(root->right);
        else return false;
    }
};

