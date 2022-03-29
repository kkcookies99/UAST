class Solution {
public:
    int XXX(TreeNode* root) 
    {
        if (!root) return 0;
        if (!root->left && root->right) {return XXX(root->right) + 1;}
        if (root->left && !root->right) {return XXX(root->left) + 1;}
        if (!root->left && !root->right) {return 1;}
        else {return min(XXX(root->left), XXX(root->right)) + 1;}
    }
};

