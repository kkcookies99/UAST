 class Solution {
public:
    bool XXX_2(TreeNode* l,TreeNode *r){
        if(l==NULL||r==NULL)
            return l==r;
        return l->val==r->val&&XXX_2(l->left,r->right)&&XXX_2(l->right,r->left);
    }
    bool XXX(TreeNode* root) {//以root为根节点的二叉树是否对称
        if(root==NULL)
            return true;
        return XXX_2(root->left,root->right);
    }
};

