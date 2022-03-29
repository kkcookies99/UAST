 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL)
            return true;
        int leftDepth=nodeDepth(root->left);
        int rightDepth=nodeDepth(root->right);
        if(fabs(leftDepth-rightDepth)>1)
            return false;
        return XXX(root->left)&&XXX(root->right);
        
    }
private:
    int nodeDepth(TreeNode *root)
    {
        if(root==NULL)
            return 0;
        return max(nodeDepth(root->left),nodeDepth(root->right))+1;
    }
};

