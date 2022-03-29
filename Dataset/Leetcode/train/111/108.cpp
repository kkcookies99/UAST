class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)   return 0;
        if(root->left != NULL && root->right != NULL)
            return 1+min(getDepth(root->left),getDepth(root->right));
        if(root->left == NULL || root->right == NULL)
            return 1+max(getDepth(root->left),getDepth(root->right));
        return 0;
    }
    
    int getDepth(TreeNode* root){
        if(!root)   return 0;
        if(root->left != NULL && root->right != NULL)
            return 1+min(getDepth(root->left),getDepth(root->right));
        if(root->left == NULL || root->right == NULL)
            return 1+max(getDepth(root->left),getDepth(root->right));
        return 0;
    }  
};

