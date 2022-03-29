class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)return 0;
        if(root->left==nullptr&&root->right==nullptr)return 1;//两个都没有
        if(root->left&&root->right)return min(XXX(root->left)+1,XXX(root->right)+1);//两个都有
        if(root->left)return XXX(root->left)+1;
        else return XXX(root->right)+1;
    }
};

