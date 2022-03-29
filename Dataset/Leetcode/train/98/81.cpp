 class Solution {
public:
    bool XXX(TreeNode* root) {
        if((root==NULL)||(root->right==NULL&&root->left==NULL)){
            return true;
        }
        if(root->left==NULL&&root->right!=NULL)
           return root->right->val > root->val? true: false;
        if(root->right==NULL&&root->left!=NULL)
           return root->left->val < root->val? true: false;
        if(root->right!=NULL&&root->left!=NULL)
           return ((root->right->val > root->val)&&(root->left->val < root->val));
        return (XXX(root->left)&&XXX(root->right));
    }
};

