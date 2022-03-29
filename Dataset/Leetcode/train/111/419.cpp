class Solution {
public:
    int XXX(TreeNode* root,int d=0) {
        if(!root)return d;
        if(!root->left&&!root->right)return 1;
        return 1+min(XXX(root->left,999999),XXX(root->right,999999));
    }
};

