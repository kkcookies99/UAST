class Solution {
public:

    int getH(TreeNode* root) {
        if (root == NULL) return 0;
        else {
            int a = getH(root->left);
            int b = getH(root->right);
            return (a>b)?a+1:b+1;
        }
    }

    bool XXX(TreeNode* root) {
        if (root == NULL) return true;

        int leftRoot  = getH(root->left);
        int rightRoot = getH(root->right);

        if ((leftRoot - rightRoot) > 1) return false;
        else if ((leftRoot - rightRoot) < -1) return false;

        return true;  
    }
};

