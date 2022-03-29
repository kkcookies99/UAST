class Solution {
public:
    void preorder(TreeNode* bt,int sum,bool &flag,int n)
    {
        if(bt==NULL)
            return;

            preorder(bt->left,sum+bt->val,flag,n);
            preorder(bt->right,sum+bt->val,flag,n);
            if(sum+bt->val==n&&bt->left==NULL&&bt->right==NULL)
            flag=true;
    }
    bool XXX(TreeNode* root, int targetSum) {
        if(root==NULL)
        return false;
        int sum=0;
        bool flag=false;
        preorder(root,0,flag,targetSum);
        return flag;
    }
};

