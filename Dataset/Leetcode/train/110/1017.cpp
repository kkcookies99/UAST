 class Solution {
public:
    bool XXX(TreeNode* root) {
       if(root==NULL) return true;
        int lefthigh=depth(root->left);
        int righthigh=depth(root->right);
        //这其中包含了判定，即减枝操作
        if(lefthigh==-1||righthigh==-1)
                return false;
        if(abs(lefthigh-righthigh)>1)
            return false;
        return XXX(root->left)&&XXX(root->right);
    }
    int depth(TreeNode*root)
    {
        if(root==NULL) return 0;
        else
        {
            int left=depth(root->left);
            int right=depth(root->right);
            if(left==-1||right==-1)
                return -1;
            if(abs(left-right)>1)
                return -1;
            
            //这其中包含了判定，即减枝操作
            
            return 1+(left>right?left:right);
        }
    }
};

