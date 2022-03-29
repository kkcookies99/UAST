class Solution {
public:
    //深度优先遍历
    int XXX(TreeNode* root) {
        if(!root) return 0;
        if(root->left!=nullptr&&root->right==nullptr)
            return XXX(root->left)+1;
        else if(root->left==nullptr&&root->right!=nullptr)
            return XXX(root->right)+1;
        else
            return min(XXX(root->left),XXX(root->right))+1;
    }
};

