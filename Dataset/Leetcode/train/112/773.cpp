 class Solution {
public:
    bool XXX(TreeNode* root, int sum) 
    {
        if(!root)
            return false;
        if(!root->left&&!root->right)
        {
            sum-=root->val;
            if(sum==0)
                return true;
            return false;
        }
        bool left=XXX(root->left,sum-root->val);
        bool right=XXX(root->right,sum-root->val);
        return left||right;
    }
};

