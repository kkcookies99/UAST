 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL)
            return true;
        return XXX(root->left,root->right);
    }
    bool XXX(TreeNode *root1,TreeNode *root2){
        if(root1==NULL&&root2==NULL)
            return true;
        else if(root1==NULL||root2==NULL)
            return false;
        if(root1->val==root2->val)
            return XXX(root1->left,root2->right)&&XXX(root1->right,root2->left);
        return false;
    }
};

