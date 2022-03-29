class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == nullptr) return 0;
        else return 1 + max(XXX(root->left), XXX(root->right));
    }
};

