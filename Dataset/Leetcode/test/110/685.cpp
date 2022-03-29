 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        if(abs(checkDepth(root->left)-checkDepth(root->right))>1)
            return false;
        else
            return XXX(root->left) && XXX(root->right);
    }
    
    int checkDepth(TreeNode* root){
        if(!root) return 0;
        return max(checkDepth(root->left),checkDepth(root->right))+1;
    }
};

