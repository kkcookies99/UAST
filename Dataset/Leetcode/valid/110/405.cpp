class Solution {
public:
    bool XXX(TreeNode* root) {
        int depth;
        return XXX_(root, depth);
    }
    bool XXX_(TreeNode* root, int& depth)
    {
        int lh, rh;//左右子树深度
        if(NULL == root)
        {
            depth = 0;
            return true;
        }
        if(!XXX_(root->left, lh))//检查左子树是否为平衡树，并求出左子树深度
            return false;
        if(!XXX_(root->right, rh))//检查右子树是否为平衡树，并求出右子树深度
            return false;
        depth = max(lh, rh) + 1;
        return abs(lh - rh) <= 1;//检查左右子树是否平衡
    }
};

