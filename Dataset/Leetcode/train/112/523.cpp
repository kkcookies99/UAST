 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL)
            return false;
        return DFS(root,0,sum);
    }
    bool DFS(TreeNode *root,int count,int sum){
        if(root==NULL)
            return false;
        if(root->left==NULL&&root->right==NULL&&count==sum-root->val)
            return true;
        return DFS(root->left,count+root->val,sum)||DFS(root->right,count+root->val,sum);
    }
};

