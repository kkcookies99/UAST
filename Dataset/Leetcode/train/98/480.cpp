 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        TreeNode* pre = nullptr;
        return Inorder(root, pre);
    }

    bool Inorder(TreeNode* root, TreeNode* &pre)
    {
        if(!root) return true;
        bool l = Inorder(root->left, pre);
        if(pre != nullptr)
            if(root->val <= pre->val)
                return false;
        pre = root;
        bool r = Inorder(root->right, pre);
        return l && r;
    }
};

