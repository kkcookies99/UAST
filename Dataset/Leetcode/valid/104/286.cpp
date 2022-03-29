class Solution {
public:
    int getdepth(TreeNode* root){
        if(root == nullptr) return 0;
        return max(getdepth(root->left),getdepth(root->right))+1;
    }

    int XXX(TreeNode* root) {
        return getdepth(root);
    }
};

