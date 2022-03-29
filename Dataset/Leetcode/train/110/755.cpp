 class Solution {
public:
    bool XXX(TreeNode* root) {
        int depth=0;
        return helper(root,depth);
    }
    
    bool helper(TreeNode* root, int& depth){
        if(!root){
            depth=0;
            return true;
        }
        
        int l,r;
        if(!helper(root->left,l)||!helper(root->right,r))
            return false;
        depth = max(l,r)+1;
        if(abs(l-r) <= 1)
            return true;
        return false;
    }
};

