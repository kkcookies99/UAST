class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)return true;
        //判断高度差是否达标；再判断子树；
        return abs(height(root->left)-height(root->right))<=1
                &&XXX(root->right)
                &&XXX(root->left);
    }
    // 计算高度
    int height(TreeNode* root){
        if(!root)return 0;
        return 1+max(height(root->left),height(root->right));
    }
};

