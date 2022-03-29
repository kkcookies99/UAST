 class Solution {
public:
    bool XXX(TreeNode* root) {
        return judge(root,root);
    }

    bool judge(TreeNode* root1,TreeNode* root2)
    {
        if(root1==nullptr && root2==nullptr)
            return true;

        if(root1==nullptr || root2==nullptr)
            return false;

        if(root1->val!=root2->val)
            return false;

        return judge(root1->left,root2->right) && judge(root1->right,root2->left);
    }
};

