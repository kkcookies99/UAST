class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==nullptr) return 0;
        if(root->left!=nullptr&&root->right!=nullptr)
            return min(XXX(root->left),XXX(root->right))+1;
        return max(XXX(root->left),XXX(root->right))+1;
        }
};

