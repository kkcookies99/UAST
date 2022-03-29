 class Solution {
public:
    bool XXX(TreeNode* root) {
        int h;
        return XXX(root, h);
    }
    
    bool XXX(TreeNode* root, int& height) {
        if (root == nullptr)
        {
            height = 0;
            return true;
        }
        int h1, h2;
        bool flag = XXX(root->left, h1) &&
            XXX(root->right, h2);
        height = max(h1, h2) + 1;
        return flag && abs(h1 - h2) <= 1;
    }
};

