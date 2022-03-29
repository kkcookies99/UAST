class Solution {
public:
    bool flag = true;
    bool XXX(TreeNode* root) {
         countH(root);
         return flag;
    }

    int countH(TreeNode* root)
    {
        if(!root)
           return 0;
        else if(!root->left&&!root->right)
           return 1;
        else
        {
            int r = 1+countH(root->right);
            int l = 1+countH(root->left);
            if(abs(r-l) > 1)
                flag = false;
            return r>l?r:l;
        }
        

    }


};

