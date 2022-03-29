 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL)  return false;  
        sum-=root->val;
        if(root->left&&root->right)  return XXX(root->left,sum)||XXX(root->right,sum);
        if(root->left)  return XXX(root->left,sum);
        if(root->right) return XXX(root->right,sum);
        else  return sum==0;
    }   
};

