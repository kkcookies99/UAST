 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL)
            return false;
        return XXX(root,sum,0);
        
    }
    bool XXX(TreeNode* root, int sum, int curr){
        bool flag=false;
        curr+=root->val;
        if(root->left==NULL&&root->right==NULL&&sum==curr)
            return true;
        if(root->left!=NULL)
            flag=XXX(root->left,sum,curr);
        if(!flag&&root->right!=NULL)
            flag=XXX(root->right,sum,curr);
        return flag;
    }
};

