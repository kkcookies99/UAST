class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==nullptr) return 0;
        if(root->left==nullptr && root->right==nullptr)
        return 1;
        if(root->left!=nullptr && root->right!=nullptr)
        return std::min(XXX(root->left),XXX(root->right))+1;
        else if(root->left!=nullptr)
        return XXX(root->left)+1;
        else 
        return XXX(root->right)+1;

    }
};

