class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == NULL)
            return 0;
        
        int l = XXX(root->left);
        int r = XXX(root->right);

        if (l && r){
            return l < r ? l + 1 : r + 1;
        } else {
            return 1 + l + r;
        }
    }
};

