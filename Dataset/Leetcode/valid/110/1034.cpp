 class Solution {
public:
    int GetDep(TreeNode *root)
    {
        if(root==NULL)
            return 0;
        return 1+max(GetDep(root->left),GetDep(root->right));
    }
    bool XXX(TreeNode* root) {
        if(root==NULL)
            return true;
        if(abs(GetDep(root->left)-GetDep(root->right))>=2)
            return false;
        return XXX(root->left) && XXX(root->right);
    }
};

