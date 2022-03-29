class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)
            return 0;
        if(!root->left)
            return XXX(root->right) + 1;
        
        if(!root->right)
            return XXX(root->left) + 1;
            
        return min(XXX(root->left), XXX(root->right)) + 1;
    }
};

