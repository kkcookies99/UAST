class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==nullptr)return 0;
        if(root->left==nullptr&&root->right==nullptr)return 1;
        else if(root->left==nullptr)return 1+XXX(root->right);
        else if(root->right==nullptr)return 1+XXX(root->left);
        else return min(1+XXX(root->left),1+XXX(root->right));
    }
};

