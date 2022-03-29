class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL) return 0;
        return max(XXX(root->left), XXX(root->right)) + 1;
    }
};

