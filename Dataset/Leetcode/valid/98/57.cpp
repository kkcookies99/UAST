 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        if(root->left)
        {
            if(root->left->val>=root->val)
                return false;
            TreeNode *le=root->left;
            while(le->right)
                le=le->right;
            if(le->val>=root->val)
                return false;
            
        }
        if(root->right)
        {
            if(root->right->val<=root->val)
                return false;
            TreeNode *ri=root->right;
            while(ri->left)
                ri=ri->left;
            if(ri->val<=root->val)
                return false;
        }
        return XXX(root->left)&&XXX(root->right);
    }
    
};

