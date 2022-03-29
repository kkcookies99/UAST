 class Solution {
public:
    bool judge=false;
    void XXX2(TreeNode* root, int targetSum)
    {
            int n=root->val;
            if(!root->right&&!root->left&&targetSum-n==0)judge=true;
            if(root->left)XXX2(root->left,targetSum-n);
            if(root->right)XXX2(root->right,targetSum-n);
    }
    bool XXX(TreeNode* root, int targetSum) {
            if(!root)return false;
            XXX2(root,targetSum);
            return judge;
    }
};



