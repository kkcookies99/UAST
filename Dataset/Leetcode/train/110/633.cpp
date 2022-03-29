 class Solution {
public:
    int flag = 1;
    int height(TreeNode* root)
    {
        if(!root) return 0;
        int heightL = height(root->left);
        int heightR = height(root->right);
        if (abs(heightL-heightR)>1) flag = 0;

        return max(heightL,heightR) + 1;
    }

    bool XXX(TreeNode* root) {
        height(root);
        return flag == 1?  true:false;
    }
};

