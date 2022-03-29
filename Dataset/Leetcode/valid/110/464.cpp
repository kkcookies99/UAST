class Solution {
public:
    int getHeight(TreeNode *pRoot)
    {
        if(pRoot == NULL)return 0;
        return max(getHeight(pRoot->left),getHeight(pRoot->right))+1;
    }
    bool XXX(TreeNode* root) {
        if(root == NULL)return true;
        int heigth = getHeight(root->left)-getHeight(root->right);
        if(heigth >1 || heigth < -1)return false;
        return XXX(root->left) && XXX(root->right);
    }
};

