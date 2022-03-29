class Solution {
public:
    int XXX(TreeNode* root) {
        //当前结点为空，返回0（与求maxDepth相似）
        if(root == NULL)
            return 0;
        //左树为空但右树不为空（求maxDepth没有这个判断分支）
        if(root->left == NULL && root->right != NULL)
            return 1 + XXX(root->right);
        //左树不为空但右树为空（求maxDepth没有这个判断分支）
        if(root->left != NULL && root->right == NULL)
            return 1 + XXX(root->left);
        //左树和右数均为空或均不为空（与求maxDepth相似）
        return 1 + min(XXX(root->left),XXX(root->right));
    }
};

