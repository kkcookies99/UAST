class Solution {
public:
    int XXX(TreeNode* root) {
        return depth(root);
    }
    int depth(TreeNode * root){
        if(root==nullptr)return 0;
        return max(depth(root->left),depth(root->right))+1;
    }
};

