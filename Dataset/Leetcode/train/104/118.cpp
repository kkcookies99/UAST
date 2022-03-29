class Solution {
public:
    int XXX(TreeNode* root) 
    {
        return root == NULL ? 0 : max(XXX(root->left), XXX(root->right)) + 1;
    }
};

