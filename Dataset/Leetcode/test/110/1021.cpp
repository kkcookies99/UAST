 class Solution {
public:
    int maxDepth(TreeNode* root) {//求树的高度
        if(root == NULL)
            return 0;
        
        int left = maxDepth(root->left);
        int right = maxDepth(root->right);
        
        return (left > right)?(left + 1):(right + 1);
    }
    bool XXX(TreeNode* root) {
        if(root == NULL)
            return true;
        if(abs(maxDepth(root->left) - maxDepth(root->right)) > 1)
            return false;
        else
        {
            if(XXX(root->left) == false)
                 return false;
            if(XXX(root->right) == false)
                 return false;
            return true;
        }   
    }
};

