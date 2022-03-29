 class Solution {
public:
    int getdeepth(TreeNode* root){
        if(root==NULL)
            return 0;
        return (1+max(getdeepth(root->left),getdeepth(root->right)));
    }
    bool XXX(TreeNode* root) {
        if(!root) return true;
        if (abs(getdeepth(root->left)-getdeepth(root->right))>1) return false;
        else
            return XXX(root->left)&&XXX(root->right);
    }
};

