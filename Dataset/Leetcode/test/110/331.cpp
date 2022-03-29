class Solution {
public:
    bool XXX(TreeNode* root) {
        if(treedepth(root)==-1)return false;
        return true;
    }
    int treedepth(TreeNode* root)//用-1做标志，表示不符合balance-tree
    {
        if(!root)return 0;
        int l=treedepth(root->left),r=treedepth(root->right);
        if(l==-1||r==-1)return -1;
        if(abs(l-r)>1)return -1;
        return max(l,r)+1;
    }
};

