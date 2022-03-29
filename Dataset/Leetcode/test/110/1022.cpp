 class Solution {
public:
    
    int calDepth(TreeNode *root)    //求树的高度
    {
        if(!root)return 0;
        
        return 1+max(calDepth(root->left),calDepth(root->right));   //最深高度
    }
    
    bool XXX(TreeNode* root) {
        
        if(!root)return true;
        
        int tmp=calDepth(root->left) - calDepth(root->right);   //两树高度之差
        
        if(tmp<=1 && tmp>=-1)   //如果小于1则继续往下找左右子树比较，直到空结点（空树显然是平衡二叉树）
            return XXX(root->left) && XXX(root->right);
        else 
            return false;   //否则返回false
        
    }
};

