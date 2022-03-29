class Solution {
public:
    bool XXX(TreeNode* root) {
        
        int depth = getDepth(root);
        if(depth == -1){
            return false;
        }
        return true;
    }
    
    int getDepth(TreeNode* root){
        
        if(!root)
            return 0;
        
        int leftDepth = getDepth(root->left);
        int rightDepth = getDepth(root->right);
        
        if(leftDepth == -1 || rightDepth == -1){
            return -1;
        }
        
        if(abs(leftDepth - rightDepth) > 1){
            return -1;
        }
        
        return leftDepth > rightDepth ? 1 + leftDepth : 1 + rightDepth;
    }
};

