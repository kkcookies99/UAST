 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL)
        {
            return true;
        }

        return isJudge(root->left,root->right);
    }

    bool isJudge(struct TreeNode* left,struct TreeNode* right)
    {
        if(left==NULL && right==NULL)
        {
            return true;
        }

        if(left==NULL || right==NULL)
        {
            return false;
        }

        if(left->val!=right->val)
        {
            return false;
        }

        return isJudge(left->left,right->right) && isJudge(right->left,left->right);
    }
};

