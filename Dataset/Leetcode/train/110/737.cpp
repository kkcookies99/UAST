 class Solution {
public:
    bool XXX(TreeNode* root) {
        bool flag=true;
        findDepth(root,flag);
        return flag;
    }
    
    int findDepth(TreeNode* root,bool& flag)
    {
        if(!flag)
            return 0;
        if(!root)
            return 0;
        int le=findDepth(root->left,flag);
        int ri=findDepth(root->right,flag);
        if(abs(le-ri)>1)
        {
            flag=false;
            return 0;
        }
        return max(le,ri)+1;
    }
};

