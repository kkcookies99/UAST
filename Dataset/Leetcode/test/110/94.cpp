class Solution {
public:
    bool flag=true;
    bool XXX(TreeNode* root) {
        if(root==NULL)
            return true;
        int tem=get_length(root);
        return flag;
    }
    int get_length(TreeNode* root)
    {
        if(root==NULL)
            return 0;
        int left=get_length(root->left);
        int right=get_length(root->right);
        if(!flag)
            return 0;
        int res=1+(left>right?left:right);
        if(abs(left-right)>1)
            flag=false;
        return res;
    }
};

