 class Solution {
public:
    bool XXX(TreeNode* root) {
        return isAVL(root);
    }
    
    bool isAVL(TreeNode* root)
    {
        if(root == NULL)
            return true;
        int height1 = count_height(root->left);
        int height2 = count_height(root->right);
        if(abs(height1 - height2) > 1)
        {
            return false;
        }
         bool flag1 = isAVL(root->left);
         bool flag2 = isAVL(root->right);
        return flag1 && flag2;
    }
    
    int count_height(TreeNode* root)
    {
        if(root == NULL)
            return 0;
        return 1+max(count_height(root->left), count_height(root->right));
    }
};

