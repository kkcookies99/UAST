class Solution {
public:
    int check(TreeNode* root)
    {
        if(!root) return 0;
        int res=1+max(check(root->left),check(root->right));
        return res;
    }
    bool XXX(TreeNode* root) {
        if(!root) return true;
        int ans=abs(check(root->left)-check(root->right));
        return ans<=1&&XXX(root->left)&&XXX(root->right);
    }
};

