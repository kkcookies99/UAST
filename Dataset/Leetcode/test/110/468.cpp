class Solution {
public:
    bool XXX(TreeNode* root) 
    {
        int depth = 0;
        return Judge(root,depth);
    }

    bool Judge(TreeNode* root,int& depth)
    {
        if(!root) return true;
        int ldep = 0,rdep = 0;
        if(Judge(root->left,ldep) && Judge(root->right,rdep) && abs(ldep - rdep) < 2)
        {
            depth = max(ldep,rdep) + 1;
            return true;
        }
        else return false;
    }
};

