 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root==NULL)
            return false;
        return helper(root,targetSum);
    }

    bool helper(TreeNode* root, int targetSum){
        targetSum-=root->val;
        if(root->left==NULL && root->right==NULL)
            return targetSum==0;
        else if(root->left==NULL)
            return helper(root->right,targetSum);
        else if(root->right==NULL)
            return helper(root->left,targetSum);
        else
            return helper(root->left,targetSum)||helper(root->right,targetSum);
    }
};

