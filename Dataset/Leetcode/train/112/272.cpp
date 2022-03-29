 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root)
            return Pathsum(root,targetSum,root->val);
        return 0;
    }
    bool Pathsum(TreeNode* root, int targetSum,int sum)
    {
        if(!root)   return false;
        bool xy=false;
        bool xz=false;
        if(sum==targetSum&&!root->left&&!root->right)
            return true;
        if(root->left)
            xy=Pathsum(root->left,targetSum,sum+root->left->val);
        if(root->right&&!xy)
            xz=Pathsum(root->right,targetSum,sum+root->right->val);
        return xy+xz;
    }
};

