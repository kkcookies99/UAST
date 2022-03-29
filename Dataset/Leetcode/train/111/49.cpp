class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==nullptr) return 0; //终止条件
        if(root->left==nullptr) return XXX(root->right)+1;   //无左子树，返回右子树深度+1
        if(root->right==nullptr) return XXX(root->left)+1;   //无右子树，返回左子树深度+1
        return min(XXX(root->left),XXX(root->right))+1; //返回左右子树最小深度+1  
    }
};

