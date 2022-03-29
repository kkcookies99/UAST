class Solution {
public:
    bool XXX(TreeNode* root)
    {
        bool balance = true;
        height(root, balance);
        return balance;
    }

private:
    int height(TreeNode* root, bool& balance)
    {
        if (!root || !balance)
            return 0;

        int l = height(root->left, balance);
        int r = height(root->right, balance);

        if (l - r > 1 || r - l > 1)
            balance = false;

        return max(l, r) + 1;
    }
};

