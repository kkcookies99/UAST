class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)return 0;
        else if(root->left&&root->right)return min(XXX(root->left),XXX(root->right)) + 1;
        else return max(XXX(root->left),XXX(root->right)) + 1;
    }
};

