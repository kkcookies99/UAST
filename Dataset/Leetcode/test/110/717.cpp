 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        
        int Left = Depth(root->left) + 1;
        int Right = Depth(root->right) + 1;
        
        if(abs(Left - Right) > 1)
            return false;
        
        return XXX(root->left) && XXX(root->right);     
    
    }
    
    //求树的深度
    int Depth(TreeNode *root){
        if(!root)
            return 0;     
        return max(Depth(root->left),Depth(root->right)) + 1;
    }
     
};

