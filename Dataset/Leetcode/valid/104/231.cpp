class Solution {
public:
    int ans=0;
    int XXX(TreeNode* root) 
    {
        FindDeepest(root,1);
        return ans;
    }

    void FindDeepest(TreeNode* root,int deep)
    {
        if(root==0)
        {
            if(deep-1>ans)
            {
                ans=deep-1;
            }
            return;
        }
        FindDeepest(root->left,deep+1);
        FindDeepest(root->right,deep+1);
        return;
    }
};

