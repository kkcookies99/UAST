class Solution {
    int order(TreeNode* root)
    {
        if (root == NULL)return 0;
        if (root->right == NULL && root->left == NULL)
            return 1;
        int h1 = order(root->left);
        int h2 = order(root->right);
        int h = 1 + (h1 > h2 ? h1 : h2);
        return h;
    }
    bool pastorder(TreeNode* root)
    {
        if (root == NULL)return true;
        bool b1 = pastorder(root->left);
        bool b2 = pastorder(root->right);
            if (!b1 || !b2)return false;//不加这行124ms，加上这行8ms或者4ms……
        bool b3;
        int h1 = order(root->left);
        int h2 = order(root->right);
        int h = h1 - h2;
        if (h >= -1 && h <= 1)
            b3 = true;
        else
            b3 = false;
        return b1 && b2 && b3;  
    }

public:
    bool XXX(TreeNode* root) {
        return pastorder(root);
    }
};

